package org.own;

public class Tractor extends SemiLorry {
	
public void tractorDetail(String name,int price) {
		
		System.out.println("Name of the tractor is:"+" "+name+"\n"+"Price of the tractor is"+" "+price);
		this.tractorSpeed(200);
	}
	public void tractorSpeed (int speed) {
		
		System.out.println("Speed of the tractor is:"+" "+speed);
		this.semilorryDetail("Rishi Semilorry",4000000);
	}


}


