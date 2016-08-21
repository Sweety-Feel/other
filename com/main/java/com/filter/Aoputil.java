package com.filter;

import java.lang.reflect.Proxy;

import com.base.AopMethod;
import com.bean.PersonPojo;

public class Aoputil {
  private static Object getPersonBase(Object obj,AopMethod method){
    return Proxy.newProxyInstance(obj.getClass().getClassLoader(),
            obj.getClass().getInterfaces(), new AOPHandle(Annotation.getbean(obj),method));
  }
  
  @SuppressWarnings({ "rawtypes" })
  public static  PersonPojo getPerson(Class person, AopMethod aopMethod){
      Object obj=null;
      try {
          obj= getPersonBase(person.newInstance(), aopMethod);
      } catch (Exception e) {
          e.printStackTrace();
      }
      return (PersonPojo) obj;
  }
}
