package chapter8;
import java.util.ArrayList;

public class CustomerTest4 {
	public static void main (String[] args) {
		ArrayList<Customer> customerList = new ArrayList<Customer>();
		
		Customer customerLee = new Customer(10010, "Lee");
		Customer customerSin = new Customer(10020, "Sin");
		Customer customerHong = new Customer(10030, "Hong");
		Customer customerSan = new Customer(10040, "San");
		Customer customerKim = new Customer(10050, "Kim");
		
		customerList.add(customerLee);
		customerList.add(customerSin);
		customerList.add(customerHong);
		customerList.add(customerSan);
		customerList.add(customerKim);
		
		
		System.out.println("============고객정보================");
		for(Customer customer : customerList) {
			System.out.println(customer.showCustomerInfo());
		}
		
		System.out.println("==============할인율과 보너스포인트 계산=================");
		
		int price = 10000;
		for(Customer customer : customerList) {
			int cost = customer.calcPrice(price);
			System.out.println(customer.getCustomerName() + "");
		System.out.println(customerLee.getCustomerName()+ "님이" + cost + "지불했습니다");
		
		System.out.println(customerKim.getCustomerName()+ "보너스 포인트는" + customer.bonusPoint);
		
		}
	}
}
