package com.base;

import java.lang.reflect.Method;

public interface AopMethod {
	void before(Object obj,Method method,Object[] args);
	void after(Object obj,Method method,Object[] args);
}
