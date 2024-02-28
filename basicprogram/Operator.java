package com.java.basicprogram;

public class Operator {

	public static void main(String[] args) {
		//assignment operator
		int a=6;
		int b=20;
		//arithmetic operator
		int c=a+b;
		int d=b-a;
		float e=b/a;
		int m=a*b;
		int r=b%a;
		System.out.println("addition: "+c+"\nsubtraction:"+d+"\nmultipliaction:"+m+"\ndivision:"+e+"\nmod:"+r);
		//string concatenation
		System.out.println(30+40+"abc"+"wxy"+10+20);
		System.out.println(true&false);
		System.out.println(true|false);
		System.out.println(true&&false);
		System.out.println(true||false);
		System.out.println(false||true);
		
		//pre-post operator
		
		a=10;
		b=++a;
		System.out.println(a);//11
		System.out.println(b);//10
		
		
		int q=10;
		b=--q;
		System.out.println(q);
		System.out.println(b);//9
		
		//a=11,b=9
//		e=a--+b++;//11+9
		e=--a+b++;
		System.out.println(a);//10
		System.out.println(b);//10
		
		System.out.println(e);//20
		
		
		

	}

}
