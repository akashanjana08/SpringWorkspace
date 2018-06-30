package com.learn.spring.rsi.SpringBulbExample;

public class BulbService {

	Bulb bulb;
	
	String askForBulb()
	{
	  return bulb.getBulb();
	}

	public Bulb getBulb() {
		return bulb;
	}

	public void setBulb(Bulb bulb) {
		this.bulb = bulb;
	}
	
	
	
}
