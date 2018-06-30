package com.learn.spring.rsi.SpringRequiredAnnotation.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.learn.spring.rsi.SpringRequiredAnnotation.aspect.Loggerable;
import com.learn.spring.rsi.SpringRequiredAnnotation.model.Circle;
import com.learn.spring.rsi.SpringRequiredAnnotation.model.Trangle;

@Component
public class SpaceService {

	@Autowired
	private Circle circle;
	@Autowired
	private Trangle trangle;

	@Loggerable
	public Circle getCircle() {
		return circle;
	}

	public void setCircle(Circle circle) {
		this.circle = circle;
	}

	public Trangle getTrangle() {
		return trangle;
	}

	public void setTrangle(Trangle trangle) {
		this.trangle = trangle;
	}
}
