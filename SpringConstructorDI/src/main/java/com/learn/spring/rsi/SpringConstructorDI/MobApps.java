package com.learn.spring.rsi.SpringConstructorDI;

public class MobApps {

	private String appName;

	public MobApps(String appName) {
		super();
		this.appName = appName;
	}

	@Override
	public String toString() {
		return "MobApps [appName=" + appName + "]";
	}
	
}
