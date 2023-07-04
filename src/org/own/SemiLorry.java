package org.own;

public class SemiLorry extends Truck {
	
public void semilorryDetail(String name,int price) {
		
		System.out.println("Name of the semilorry is:"+" "+name+"\n"+"Price of the semilorry is"+" "+price);
		this.semilorrySpeed(200);
	}
	public void semilorrySpeed (int speed) {
		
		System.out.println("Speed of the semilorry is:"+" "+speed);
		this.truckDetail("Shish truck",5000000);
	}


}


