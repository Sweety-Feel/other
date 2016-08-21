package com.plugin;

import org.nutz.plugin.Plugin;

public  class Petersayplugin implements Said,Plugin {
	private String profix;
  private Said said;
	@Override
	public String say() {
		return profix + said.say();
	}
	@Override
	public boolean canWork() {
		try{
  	  said = (Said)(Class.forName("com.plugin.Petersay").newInstance());
  		return true;
  	}catch(Exception e){}
  	return false;
	}
}
