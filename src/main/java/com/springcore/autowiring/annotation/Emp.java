package com.springcore.autowiring.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Emp {
	@Autowired // if we use this annotation in property then propeprty injection will called
	@Qualifier("addr1") // specifying name of bean which you want to inject 
	private Address address;

	public Address getAddress() {
		return address;
	}
    // @Autowired // if we use this annotation in setter then setter injection will called 
	public void setAddress(Address address) {
		System.out.println("Setting value");
		this.address = address;
	}
   //  @Autowired // if we use this annotation in constructor then constructor injection will called
	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Emp(Address address) {
		super();
		this.address = address;
	}

	@Override
	public String toString() {
		return "Emp [address=" + address + "]";
	}
	
	
}
