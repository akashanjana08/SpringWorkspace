package com.learn.spring.rsi.SpringRequiredAnnotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Pancard {

	@Value("FMYPS5432")
	private String panNumber;
	
	@Value("#{employee.name}")
	private String panHolderName;

	public String getPanNumber() {
		return panNumber;
	}

	public void setPanNumber(String panNumber) {
		this.panNumber = panNumber;
	}

	public String getPanHolderName() {
		return panHolderName;
	}

	public void setPanHolderName(String panHolderName) {
		this.panHolderName = panHolderName;
	}
	
	
}
