package com.aop;

import org.nutz.ioc.Ioc;
import org.nutz.ioc.aop.Aop;
import org.nutz.ioc.impl.NutIoc;
import org.nutz.ioc.loader.annotation.AnnotationIocLoader;
import org.nutz.ioc.loader.annotation.IocBean;
import org.nutz.log.Log;
import org.nutz.log.Logs;

@IocBean
public class UserAction {
	private static Log log =Logs.get();
	@Aop({"usertest"})
	public boolean login(String username , String password) throws Throwable {
		if("zhanghui".equals(username)&&"123".equals(password)){
			log.infof("登陆成功");
			return true;
		}
		log.infof("登录失败");
		return false;
	}
	public static void main(String[] args) throws Throwable {
		Ioc ioc =new NutIoc(new AnnotationIocLoader("com.aop"));
		UserAction ac =ioc.get(UserAction.class);
		ac.login("zhanghui", "123");
	}
}
