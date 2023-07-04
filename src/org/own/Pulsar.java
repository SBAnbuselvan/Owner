package org.own;

public abstract class Pulsar extends Ktm {
	
public abstract void pulsarDetail(String name,int price);
	
	public void pulsarSpeed(int speed) {
		
		System.out.println("Speed of the bike:"+" "+speed);
		this.ktmSpeed(300);
	}
		
	


}

