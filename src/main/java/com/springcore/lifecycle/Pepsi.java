package com.springcore.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Pepsi  implements InitializingBean , DisposableBean{
	private double price;

	public Pepsi() {
		super();
		// TODO Auto-generated constructor stub
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Pepsi [price=" + price + "]";
	}

	// this method act as a init method because this will run after setting properties
	public void afterPropertiesSet() throws Exception {
			System.out.println("Initializing Bean");
	}
	// this method act as a destroy() because this will run after work done
	public void destroy() throws Exception {
		System.out.println("Destroying Bean");
		
	}
	
	
	
	
}
