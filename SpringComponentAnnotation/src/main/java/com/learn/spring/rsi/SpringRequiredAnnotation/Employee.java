package com.learn.spring.rsi.SpringRequiredAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component   // Employee employee= new Employee
public class Employee {

	@Value("akash sharma")
	private String name;
	
	@Value("0722110008")
	private String rollNum;
	
	@Autowired(required=false)
	private Pancard panCard;

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public String getRollNum() {
		return rollNum;
	}
	

	public void setRollNum(String rollNum) {
		this.rollNum = rollNum;
	}

	public Pancard getPanCard() {
		return panCard;
	}
	
	public void setPanCard(Pancard panCard) {
		this.panCard = panCard;
	}
}
