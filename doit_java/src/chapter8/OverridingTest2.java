package chapter8;

public class OverridingTest2 {
	public static void main(String[] args) {
		Customer vc = new VIPCustomer (10030, "na" , 2000);
		vc.bonusPoint = 1000;
		
		System.out.println(vc.getCustomerName() + " 님이지불해야하는 금액은 " + vc.calcPrice(10000));
	}
}
