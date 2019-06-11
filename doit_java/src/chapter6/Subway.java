package chapter6;

public class Subway {

	String lineNumber;
	int passengerCount;
	int money;
	
	public Subway(String lineNumber) {
		this.lineNumber = lineNumber; // 지하철 노선번호를 매개변수로 받는 생성자
	}
	
	public void take(int money) {
		this.money += money;   //승객이 지하철에 탄 경우를 구현한 메서드
		passengerCount++;
	}
	public void showInfo() {
		System.out.println(lineNumber + "의 승객은" + passengerCount + "명이고 수입은" +money);
	}
}
