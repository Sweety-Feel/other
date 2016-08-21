package com.bean.pojo;

import com.base.Seven;
import com.bean.PersonPojo;

public class Person implements PersonPojo{
	@Seven(value="张辉")
  public String name;
	private String property;
	public void setname(String name) {
		this.name = name;
	}

	public String getname() {
		return this.name;
	}

	public void speak() {
    System.out.println("speak：张辉学java");		
	}

	public void getproperty() {
		System.out.println(this.name + this.property);
}

	@Seven(property ="学Aop动态代理")
	public void setproperty(String property) {
    this.property =property;		
	}
}
