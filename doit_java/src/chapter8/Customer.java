package chapter8;

public class Customer {
protected int customerID;
protected String customerName;
protected String customerGrade;
int bonusPoint;
double bonusRatio;

public Customer() {
	customerGrade = "Silver";
	bonusRatio = 0.01;
}

public int calcPrice(int price) {
	bonusPoint += price * bonusRatio;
	return price;
}
public String showCustomerInfo() {
	return customerName + "is grade" + customerGrade + "bonus point is" + bonusPoint;
}
public int getCustomerID() {
	return customerID;
}
public void setCustomerID(int customerID) {
	this.customerID = customerID;
}
public String getCustomerName() {
	return customerName;
}
public void setCustomerName(String customerName) {
	this.customerName = customerName;
}
public String getCustomerGrade() {
	return customerGrade;
}

public void setCustomerGrade(String customerGrade) {
	this.customerGrade = customerGrade;
}
}
