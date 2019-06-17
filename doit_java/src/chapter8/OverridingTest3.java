package chapter8;

public class OverridingTest3 {
	public static void main(String[] args) {
		int price = 10000;
		
		Customer customerLee = new Customer(100010, "Lee");
		System.out.println(customerLee.getCustomerName() + " 님이지불해야하는 금액은 " + customerLee.calcPrice(price));
		
		VIPCustomer customerkim = new VIPCustomer(100020, "Kim", 12345);
		System.out.println(customerkim.getCustomerName() + " 님이지불해야하는 금액은 " + customerkim.calcPrice(price));

		Customer vc = new VIPCustomer (10030, "na" , 2000);
		System.out.println(vc.getCustomerName() + " 님이지불해야하는 금액은 " + vc.calcPrice(10000));
	}
}
