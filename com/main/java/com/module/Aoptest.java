package com.module;

import java.lang.reflect.Method;

import com.base.AopMethod;
import com.bean.PersonPojo;
import com.bean.pojo.Person;
import com.filter.Aoputil;

public class Aoptest {
  public static void main(String args[]){
  	PersonPojo person = Aoputil.getPerson(Person.class,new AopMethod(){

			@Override
			public void before(Object obj, Method method, Object[] args) {
				if(method.getName().equals("speak")){
					System.out.println("开始："+"Aop拦截了"+method.getName());
				}
			}

			@Override
			public void after(Object obj, Method method, Object[] args) {
				if(method.getName().equals("speak"))
					System.out.println("结束："+"Aop拦截了"+method.getName());
			}
  	});
  	person.speak();
  	String name1 = "我的名字："+ person.getname();
  	person.getproperty();
  	System.out.println(name1);
  	person.setname("小张辉");
  	String name2 = "另一个名字：" + person.getname();
  	System.out.println(name2);
  	person.getproperty();
  }
}
