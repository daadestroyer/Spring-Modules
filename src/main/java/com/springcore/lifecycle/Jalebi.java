package com.springcore.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Jalebi {
	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		System.out.println("Setting price ");
		this.price = price;
	}

	@Override
	public String toString() {
		return "Jalebi [price=" + price + "]";
	}

	public Jalebi() {
		super();
		// TODO Auto-generated constructor stub
	}

	@PostConstruct
	public void start() {
		System.out.println("Initialzing Bean");
	}

	@PreDestroy
	public void destroy() {
		System.out.println("Destroying Bean");
	}
}
