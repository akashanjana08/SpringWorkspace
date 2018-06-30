package com.learn.spring.rsi.SpringBeanLifeCycle;

public class Student {

	public void showMessage()
	{
		System.out.println("student is Computer science");
	}
	
	public void init()
	{
		System.out.println("Init Call");
	}
	
	public void destroy()
	{
		System.out.println("Destroy");
	}
}
