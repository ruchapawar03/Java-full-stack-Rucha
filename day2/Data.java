package com.java.day2;

public class Data {
	static {
		System.out.println("static block");
	}
	public void m1() {
		System.out.println("method m1");
	}

	public static void main(String[] args) {
		System.out.println("main method");
		B.m2();//static method can be accessed in another classes and also different by import
		Data d=new Data();
		d.m1();

	}

}
