package chapter6;

public class TakeTrans {
	
	public static void main (String[] args) {
		
	Student studentJames = new Student("James", 5000);
	Student studentTomas = new Student("Tomas", 10000);
	
	Student studentTom = new Student("Tom", 8000);
	
	Bus bus100 = new Bus(100);
	studentJames.takeBus(bus100);
	studentJames.showInfo();
	bus100.showInfo();

	Subway subwayGreen = new Subway("no.2");
	studentTomas.takeSubway(subwayGreen);
	
	Taxi taxiBlack = new Taxi("black");
	studentTom.takeTaxi(taxiBlack);
	taxiBlack.showInfo();
	studentTom.showInfo();

	

	studentTomas.showInfo();
	subwayGreen.showInfo();
	}
}
