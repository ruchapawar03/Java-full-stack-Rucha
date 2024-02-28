package com.java.basicprogram;

public class Typecasting {

	public static void main(String[] args) {
		byte a=10;
		int d=a;
		
		System.out.println(d);//implicit
		
		int r=20;
//		byte rt=r;//big to small
		
		byte rt=(byte)r;//explicit
		
		int s=129;
		byte st=(byte)s;
		System.out.println(st);
		
		short sh=3267;
		float f=10.4f;
		double dou=20.6;
//		char e='a';
//		System.out.println(e);
		char e=97;
		System.out.println(e);
		
		
		
		
		
		
		

	}

}
