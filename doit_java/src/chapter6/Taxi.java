package chapter6;

public class Taxi {

		String taxicolor;
		int passengerCount;
		int money;
		
		public Taxi(String taxicolor) {
			this.taxicolor = taxicolor;
		}
		
		public void take (int money) {
			this.money += money;
			passengerCount++;
			
		}
		public void showInfo() {
			System.out.println("taxi" + taxicolor + "person." + "money is" + money);
		}
	}
	