//Local Global variable access

package com.java.basicprogram;

public class LocalGlobal {
	int a=10;
	public void m1(int b) {
		b=30;
		System.out.println(b);
		System.out.println(a);
	}
	public void m2() {
//		System.out.println(b);//local variable access not allowed
		System.err.println(a);
	}

	public static void main(String[] args) {
		LocalGlobal l=new LocalGlobal();
		l.m1(10);//gives priority to local variable hence value is 30 first
		l.m2();//unresolved variable exception

	}

}
