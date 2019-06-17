package chapter8;

public class CustomerTest2 {

	public static void main(String[] args) {
		
		VIPCustomer customerkim = new VIPCustomer();
		customerkim.setCustomerID(10020);
		customerkim.setCustomerName("KIM");
		customerkim.bonusPoint = 10000;
		System.out.println(customerkim.showCustomerInfo());
	
	}
}
