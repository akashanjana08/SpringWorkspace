package com.learn.spring.rsi.SpringRequiredAnnotation.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Trangle {
	@Value("This is Trangle")
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
