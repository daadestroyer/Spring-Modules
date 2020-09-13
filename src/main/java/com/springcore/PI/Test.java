package com.springcore.PI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		Student s1 = (Student)context.getBean("student1");
		Student s2 = (Student)context.getBean("student2");
		Student s3 = (Student)context.getBean("student3");
		Emp e1 = (Emp)context.getBean("employee1");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(e1);

	}

}
