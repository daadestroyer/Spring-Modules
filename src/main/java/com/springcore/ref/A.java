package com.springcore.ref;

public class A {

	private int x;
	private B Ob;

	@Override
	public String toString() {
		return "A [x=" + x + ", b=" + Ob + "]";
	}

	public A() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public B getOb() {
		return Ob;
	}

	public void setOb(B ob) {
		Ob = ob;
	}


}
