package com.bean.pojo;

import org.nutz.dao.entity.annotation.Column;
import org.nutz.dao.entity.annotation.Comment;
import org.nutz.dao.entity.annotation.Name;
import org.nutz.dao.entity.annotation.Table;

@Comment("用户")
@Table("user")
public class User {
  @Name
  @Comment("用户名*全局唯一")
  @Column
  private String username;
  @Comment("emil")
  @Column
  private String emil;
  @Comment("手机号码")
  @Column
  private int sms;
  @Comment("用户密码")
  @Column
  private String password;
  
  public String getusername(){
  	return username;
  }
  public User setusername(String username){
  	this.username = username;
  	return this;
  }
  public String getemil(){
  	return emil;
  }
  public User setemil(String emil){
  	this.emil = emil;
  	return this;
  }
  public int getsms(){
  	return sms;
  }
  public User setsms(int sms){
  	this.sms = sms;
  	return this;
  }
  public String getpassword(){
  	return password;
  }
  public User setpassword(String password){
  	this.password = password;
  	return this;
  }
}
