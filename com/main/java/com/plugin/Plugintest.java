package com.plugin;

import org.nutz.ioc.Ioc;
import org.nutz.ioc.impl.NutIoc;
import org.nutz.ioc.loader.json.JsonLoader;
import org.nutz.plugin.IocPluginManager;
import org.nutz.plugin.PluginManager;

public class Plugintest {
  public static void main(String args[]){
  	Ioc ioc = new NutIoc(new JsonLoader("com/main/resources/config.js"));
  	PluginManager<Said> plugin = new IocPluginManager<Said>(ioc ,"Tom","peter");
  	for(int i=0;i<plugin.gets().size();i++){
  		Said said = plugin.gets().get(i);
    	System.out.println(said.say());
  	}
  }
}
