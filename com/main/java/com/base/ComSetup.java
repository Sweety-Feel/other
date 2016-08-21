package com.base;

import org.nutz.dao.Dao;
import org.nutz.dao.impl.sql.SqlFormat;
import org.nutz.dao.util.Daos;
import org.nutz.ioc.Ioc;
import org.nutz.log.Log;
import org.nutz.log.Logs;
import org.nutz.mvc.Mvcs;
import org.nutz.mvc.NutConfig;
import org.nutz.mvc.Setup;

public class ComSetup implements Setup{
  private static Log log = Logs.get();
	@Override
	public void init(NutConfig nc) {
    Ioc ioc =nc.getIoc();
    Daos.setSqlFormat(SqlFormat.minimize);
    Mvcs.DISABLE_X_POWERED_BY = true;
    Daos.createTablesInPackage(ioc.get(Dao.class), "com.bean.pojo", false);
	}





	@Override
	public void destroy(NutConfig nc) {
		// TODO Auto-generated method stub
		
	}

}
