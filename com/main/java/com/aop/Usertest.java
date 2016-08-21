package com.aop;

import org.nutz.aop.InterceptorChain;
import org.nutz.aop.MethodInterceptor;
import org.nutz.ioc.loader.annotation.IocBean;
import org.nutz.log.Log;
import org.nutz.log.Logs;

@IocBean
public class  Usertest implements MethodInterceptor {
  private static Log log = Logs.get();
	@Override
	public void filter(InterceptorChain chain) throws Throwable {
		log.infof("方法执行："+chain.getCallingMethod());
		chain.doChain();
		log.infof("执行完毕："+chain.getCallingMethod());
	}

}
