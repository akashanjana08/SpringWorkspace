package com.learn.spring.rsi.SpringConstructorDI;

import java.util.List;

public class Mobile {

	private Ram ram;
	List<MobApps> mobApps;
	
	
	public Mobile(Ram ram)
	{
		this.ram = ram;
		System.out.println(ram);
	}
	
	public Mobile()
	{
		System.out.println("Mobile Default Cons");
	}
	
	public Mobile(int x)
	{
		System.out.println("Mobile One Int args Cons "+x);
	}
	
	public Mobile(String data)
	{
		System.out.println("Mobile One String args Cons "+data);
	}
	
	public Mobile(String data,int x ,List<MobApps> mobApps)
	{
		this.mobApps= mobApps;
		System.out.println("Mobile two args Cons "+data+"  :"+x+" ListObject "+mobApps);
	}

	public Ram getRam() {
		return ram;
	}
	public void setRam(Ram ram) {
		this.ram = ram;
	}

	public List<MobApps> getMobApps() {
		return mobApps;
	}

	public void setMobApps(List<MobApps> mobApps) {
		this.mobApps = mobApps;
	}
	
	public void list()
	{
		System.out.println(mobApps);
	}
}
