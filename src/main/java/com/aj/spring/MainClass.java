package com.aj.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 * 
 */
public class MainClass {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"spring-config.xml");
		
		Customer bean = (Customer) context.getBean("cust");
		bean.chargeCustomer();
		
		bean = (Customer) context.getBean("cust2");
		bean.chargeCustomer();
	}
}
