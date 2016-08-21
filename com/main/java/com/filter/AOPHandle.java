package com.filter;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

import com.base.AopMethod;

public class AOPHandle implements InvocationHandler {
  private Object obj;
  private AopMethod method;
	public AOPHandle(Object obj, AopMethod method) {
		this.obj=obj;
		this.method =method;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		Object ret=null;
    this.method.before(proxy, method, args);
    this.method.after(proxy, method, args);
    ret=method.invoke(obj, args);
    return ret;
	}
}
