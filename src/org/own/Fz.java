package org.own;

public abstract class Fz extends Splendor{
	
	public abstract void fzDetail(String name,int price);
	
	public void fzSpeed(int speed) {
		
		System.out.println("Speed of the bike:"+" "+speed);
		this.splendorSpeed(80);
	}
	


}
