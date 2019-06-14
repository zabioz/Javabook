package chapter8;

public class CustomerTest1 {

	public static void main(String[] args) {
		Customer customerLee = new Customer();
		customerLee.setCustomerID(10010);
		customerLee.setCustomerName("LEE");
		customerLee.bonusPoint = 1000;
		System.out.println(customerLee.showCustomerInfo());
		
		VIPCustomer customerkim = new Customer();
		customerkim.setCustomerID(10020);
		customerkim.setCustomerName("KIM");
		customerkim.bonusPoint = 10000;
		System.out.println(customerkim.showCustomerInfo());
	
	}
}
