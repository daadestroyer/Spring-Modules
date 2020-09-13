package com.springcore.CI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/CI/CIconfig.xml");
		Person p = (Person) context.getBean("p1");
		System.out.println(p);	
		
		
		Addition add = (Addition) context.getBean("add");
		add.doSum();
	
	}

}
