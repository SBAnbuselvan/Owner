package org.own;

public class Lorry extends Fz {
	
	public void lorryDetail(String name,int price) {
		System.out.println("Name of the lorry:"+" "+name+"\n"+"Price of the lorry:"+" "+price);
		this.lorrySpeed(280);
	}
		public void lorrySpeed(int speed) {
			
			System.out.println("Speed of the lorry is:"+" "+speed);
			this.fzDetail("FZ",200000);
		}
		@Override
		public void fzDetail(String name, int price) {
			System.out.println("Name of the bike:"+" "+name+"\n"+"Price of the bike:"+" "+price);
			this.splendorDetail("Splendor",50000);
		}
		@Override
		public void splendorDetail(String name, int price) {
			System.out.println("Name of the bike"+" "+name+"\n"+"Price of the bike:"+" "+price);
			this.mtDetail("Mt-15",150000);
			
		}
		@Override
		public void mtDetail(String name, int price) {
			System.out.println("Name of the bike:"+" "+name+"\n"+"Price of the bike:"+" "+price);
			this.pulsarDetail("NS 200",100000);
		}
		@Override
		public void pulsarDetail(String name, int price) {
			System.out.println("Name of the bike:"+" "+name+"\n"+"Price of the bike:"+" "+price);
			this.ktmDetail("Duke 200",250000);
		}
		@Override
		public void ktmDetail(String name, int price) {
			System.out.println("Name of the bike:"+" "+name+"\n"+"Price of the bike:"+" "+price);
			this.fzSpeed(200);
		}
		
		}
	
