package com.plugin;

import org.nutz.plugin.Plugin;

public class Tomsayplugin implements Said, Plugin{
	private String profix;
	private Said said;
	@Override
	public boolean canWork() {
		try{
			said = (Said)(Class.forName("com.plugin.Tomsay").newInstance());
			return true;
		}catch(Exception e){}
		return false;
	}

	@Override
	public String say() {
		return profix + said.say();
	}

}
