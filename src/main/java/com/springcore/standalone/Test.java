package com.springcore.standalone;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/standalone/standalone_config.xml");
		Person p1 = context.getBean("p1",Person.class);
		System.out.println(p1);
		System.out.println(p1.getFriends().getClass().getName());
		System.out.println("__________________________________________________________");
		System.out.println(p1.getFee());
		System.out.println(p1.getFee().getClass().getName());
		System.out.println("__________________________________________________________");
		System.out.println(p1.getProperties());
	}
}
