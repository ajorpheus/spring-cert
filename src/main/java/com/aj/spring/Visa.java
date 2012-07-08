package com.aj.spring;

public class Visa implements CreditCard {

	@Override
	public String performOperation() {
		return "Visa";
	}

}
