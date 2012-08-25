package com.aj.spring;

import org.springframework.stereotype.Component;

@Component
public class User {

	@SuppressWarnings("unused")
	private String name;

	public void setName(String name) {
		this.name = name;
	}
}
