package org.own;

public class Truck extends Lorry{
	
public void truckDetail(String name,int price) {
		
		System.out.println("Name of the truck is:"+" "+name+"\n"+"Price of the truck is"+" "+price);
		this.truckSpeed(180);
	}
	public void truckSpeed (int speed) {
		
		System.out.println("Speed of the truck is:"+" "+speed);
		this.lorryDetail("Balan Lorry",4000000);
	}
	

	
}
