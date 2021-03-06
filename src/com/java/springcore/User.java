package com.java.springcore;

import org.springframework.stereotype.Component;

@Component
public class User {
	private String name;
	private String age;

	public String initialization() {
		return "Initialization Started!!!";
	}

	public void destructor() {
		System.out.println("destructor Completed!!!");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

}
