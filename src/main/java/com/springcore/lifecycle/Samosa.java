package com.springcore.lifecycle;

public class Samosa {
	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		System.out.println("Setting price");
		this.price = price;
	}

	public Samosa() {
		super();

	}

	@Override
	public String toString() {
		return "Samosa [price=" + price + "]";
	}
	
	public void hey() { // if you change the name of init or destroy method here then change them in xml file also
		System.out.println("Inside init method");
	}
	public void bye() {
		System.out.println("Inside destroy method");
	}
	 
	
}
