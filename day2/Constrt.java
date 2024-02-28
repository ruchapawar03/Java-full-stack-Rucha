package com.java.day2;

public class Constrt {
	public Constrt() {
		System.out.println("constructor");
	}
	{
		System.out.println("non static block");
	}
	{
		System.out.println("non static 2");
	}
	static {
		System.out.println("static block");
	}
	static {
		System.out.println("static 2");
	}
	

	public static void main(String[] args) {
		Constrt c=new Constrt();
		Constrt c1=new Constrt();
		
		
		

	}

}
