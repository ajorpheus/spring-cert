package com.aj.spring;

public class MasterCard implements CreditCard {

	@Override
	public String performOperation() {
		return "Mastercard";
	}

}
