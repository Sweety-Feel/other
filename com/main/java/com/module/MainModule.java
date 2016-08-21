package com.module;

import org.nutz.mvc.annotation.By;
import org.nutz.mvc.annotation.ChainBy;
import org.nutz.mvc.annotation.Fail;
import org.nutz.mvc.annotation.Filters;
import org.nutz.mvc.annotation.IocBy;
import org.nutz.mvc.annotation.Modules;
import org.nutz.mvc.annotation.Ok;
import org.nutz.mvc.annotation.SetupBy;
import org.nutz.mvc.ioc.provider.ComboIocProvider;

import com.base.ComSetup;
import com.filter.ComFilter;

@Modules(scanPackage=true)
@Ok("json")
@Fail("auto:default/error.html")
@IocBy(type=ComboIocProvider.class ,args={"*json","config.js","*anno","com","*tx"})
@SetupBy(ComSetup.class)
@Filters(@By(type = ComFilter.class))
@ChainBy(args={"chain.js"})
public class MainModule {
}
