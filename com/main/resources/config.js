var ioc ={
    dao : {
      type : "org.nutz.impl.NutDao",
      agrs : [{
        refer : "datasource"
      }]
    },
    datasource : {
      type : "com.alibaba.druid.pool.DruidDataSource",
      event : {
        init : "init",
        depose : "close"
      },
      field : {
        url : {
          java : "$config.get('jdbc-url')"
        },
        username : {
          java : "$config.get('jdbc-username')"
        },
        password : {
          java : "$config.get('jdbc-password')"
        },
        maxActive : 30,
        defaultAutoCommit : false,
      }
    },
    config : {
      type : "org.nutz.ioc.impl.PropertiesProxy",
      field : {
        paths : ["config.properties"]
      }
    },
    peter : {
      type : "com.plugin.Petersayplugin",
      fields : {
        profix : "Peter："
      }
    },
    Tom : {
      type : "com.plugin.Tomsayplugin",
      fields : {
        profix : "Tom："
      }
    }
}