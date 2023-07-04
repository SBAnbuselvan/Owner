package org.own;

public abstract class Mt extends Pulsar {
	
public abstract void mtDetail(String name,int price);
	
	public void mtSpeed(int speed) {
		
		System.out.println("Speed of the bike:"+" "+speed);
		this.pulsarSpeed(280);
	}
		
		

}
