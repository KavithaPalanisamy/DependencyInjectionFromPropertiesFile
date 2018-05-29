package com.java.springcore;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		User coach = context.getBean("user", User.class);
		System.out.println(coach.initialization());
		// User coach1 = context.getBean("user", User.class);
		// System.out.println(coach.equals(coach1));
		// System.out.println(coach == coach1);
		// System.out.println(coach);
		// System.out.println(coach1);
		context.close();
	}

}
