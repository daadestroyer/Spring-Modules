package com.springcore.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/lifecycle/config.xml");
		// Registering shutdown hook
		context.registerShutdownHook();

		//Samosa s1 = (Samosa) context.getBean("samosa1");
		//System.out.println(s1);

/*		System.out.println("---------------------");
		Pepsi p1 = (Pepsi) context.getBean("pepsi1");
		System.out.println(p1);
*/
		Jalebi j1 = (Jalebi)context.getBean("jalebi1");
		System.out.println(j1);
	}

}
