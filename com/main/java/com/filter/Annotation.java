package com.filter;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

import com.base.Seven;

public class Annotation {
  public static Object getbean(Object obj) {
		try{
			Field f[] =obj.getClass().getDeclaredFields(); 
			for(Field ff :f){
				Seven s = ff.getAnnotation(Seven.class);
				System.out.println("张辉："+s);
				if(s!=null){
					System.out.println("注入"+ff.getName() + s.value());
					ff.set(obj,s.value());
				}
			}
      Method m[] = obj.getClass().getDeclaredMethods();
      for(Method mm :m){
      	Seven s = mm.getAnnotation(Seven.class);
      	System.out.println("看看："+s);
    			if(s!=null){
    				 System.out.println("注入" + mm.getName() + s.property());
             mm.invoke(obj, s.property());
    			}
      }
		}catch(Exception e){
      e.printStackTrace();
		}
		return obj;
	}
}
