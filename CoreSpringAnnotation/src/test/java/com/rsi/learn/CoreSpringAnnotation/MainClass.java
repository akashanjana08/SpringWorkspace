package com.rsi.learn.CoreSpringAnnotation;

import org.springframework.beans.factory.annotation.Autowired;

public class MainClass {
     
	@Autowired
	static Student student;
	public static void main(String[] args) {
		
		
		Address add = student.getAddress();
		add.setCity("Sitapur");
		System.out.println(student.getAddress().getCity());
	}
}
