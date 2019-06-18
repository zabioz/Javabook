package chapter8;

public class OverridingTest1 {
	public static void main(String[] args) {
		Customer customerLee = new Customer(100010, "Lee");
		customerLee.bonusPoint = 1000;
		
		VIPCustomer customerkim = new VIPCustomer(100020, "Kim", 12345);
		customerkim.bonusPoint = 10000;
		
		int price = 10000;
		System.out.println(customerLee.getCustomerName() + " 님이 지불해야하는 금액은 " + customerLee.calcPrice(price));
		System.out.println(customerkim.getCustomerName() +" 님이 지불해야하는 금액은 " + customerkim.calcPrice(price));
	}
}
