package com.rsi.learn.FirstSpring;

import org.omg.CORBA.portable.ApplicationException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	
	public static void main(String[] args) {
		
		try
		{
		   ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		   System.out.println(appContext);
		   Student student = (Student)appContext.getBean("student");
		   System.out.println(student);
		   /*student.setId(1);
		   student.setName("Akash");
		   System.out.println(student.getId()+"==="+student.getName());*/
		   
		   Student student1 = (Student)appContext.getBean("student");
		   System.out.println(student1);
		   
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
