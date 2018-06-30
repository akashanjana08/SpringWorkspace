package com.learn.spring.rsi.SpringRequiredAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;

public class Employee {

	private String name;
	private String rollNum;
	
	@Autowired
	@Qualifier("pancard2")
	private Pancard panCard;

	public String getName() {
		return name;
	}
	@Required
	public void setName(String name) {
		this.name = name;
	}

	public String getRollNum() {
		return rollNum;
	}
	
	@Required
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
