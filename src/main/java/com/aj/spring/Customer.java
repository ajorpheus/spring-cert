package com.aj.spring;


public class Customer {
	
	private String name;
	
	private CreditCard creditCard;

	public void setCreditCard(CreditCard creditCard) {
		this.creditCard = creditCard;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void chargeCustomer(){
		System.out.println("Charging customer : " + name);
		System.out.println("Card Type : " + creditCard.performOperation());
	}

}
