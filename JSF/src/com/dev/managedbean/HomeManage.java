package com.dev.managedbean;

import javax.faces.bean.ManagedBean;

@ManagedBean(name = "homeManage", eager = true)
public class HomeManage {
	public HomeManage() {
		System.out.println("HelloWorld started!");
	}

	public String getMessage() {
		return "getMessage : TEST JSF";
	}
}
