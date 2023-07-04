package org.own;

public class Vehicle extends Tractor implements Hyundai,MarutiSuziki,Renault,Toyata,Tata {//final child

public void vehicleDetail(String name,int price) {
	System.out.println("Name of the vehicle:"+" "+name+"\n"+"Price of the vehicle:"+" "+price);
	this.vehicleSpeed(300);
}
public void vehicleSpeed(int speed) {
	System.out.println("Speed of the vehicle:"+" "+speed);
	this.tataDetail("Tata",6500000);
}
@Override
public void tataDetail(String name, int price) {
	System.out.println("Name of the car:"+" "+name+"\n"+"Price of the car:"+" "+price);
	this.tataSpeed(200);
}
@Override
public void tataSpeed(int speed) {
	System.out.println("Speed of the car is:"+" "+speed);
	this.toyataDetail("Toyata",5000000);
}
@Override
public void toyataDetail(String name, int price) {
	System.out.println("Name of the car:"+" "+name+"\n"+"Price of the car:"+" "+price);
	this.toyataspeed(350);
}
@Override
public void toyataspeed(int speed) {
	System.out.println("Speed of the car is:"+" "+speed);
	this.renaultDetail("Renault",7000000);
}
@Override
public void renaultDetail(String name, int price) {
	System.out.println("Name of the car:"+" "+name+"\n"+"Price of the car:"+" "+price);
	this.renaultSpeed(400);
}
@Override
public void renaultSpeed(int speed) {
	System.out.println("Speed of the car is:"+" "+speed);
	this.marutiDetail("MarutiSuziki",6000000);
}
@Override
public void marutiDetail(String name, int price) {
	System.out.println("Name of the car:"+" "+name+"\n"+"Price of the car:"+price);
	this.marutiSpeed(320);
}
@Override
public void marutiSpeed(int speed) {
	System.out.println("Speed of the car is:"+" "+speed);
	this.hyundaiDetail("Hyundai",4000000);
}
@Override
public void hyundaiDetail(String name, int price) {
System.out.println("Name of the car:"+" "+name+"\n"+"Price of the car:"+price);
	this.hyundaiSpeed(400);
}
@Override
public void hyundaiSpeed(int speed) {
	System.out.println("Speed of the car is:"+" "+speed);
	this.tractorDetail("Anbu Tractor",10000000);
}
public static void main(String[]args) {
	Vehicle v=new Vehicle();
	v.vehicleDetail("Common vehicle",5000000);
}
		
}