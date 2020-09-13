package com.springcore.CI;

import java.util.List;

public class Person {
	private String name;
	private int pid;
	private Certi certi;
	private List<String> phn_no;

	public Person(String name, int pid, Certi certi, List<String> phn_no) {
		this.name = name;
		this.pid = pid;
		this.certi = certi;
		this.phn_no = phn_no;
	}

	@Override
	public String toString() {
		return this.name + " : " + this.pid + " { " + this.certi.name + " }" + " : " + phn_no;
	}

}
