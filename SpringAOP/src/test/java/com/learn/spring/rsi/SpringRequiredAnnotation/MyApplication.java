package com.learn.spring.rsi.SpringRequiredAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Unit test for simple App.
 */
public class MyApplication {

	public static void main(String[] args) {
  
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		System.out.println(applicationContext);
		 
	}
}
