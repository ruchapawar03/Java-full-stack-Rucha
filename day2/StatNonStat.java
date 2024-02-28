package com.java.day2;

public class StatNonStat {
	public void m1() {
		System.out.println("method m1");
		
	}
	public int m2() {
		return 11000;
	}
	public float m3() {
		return 1.4f;
	}
	public boolean m4() {
		return true;
	}

	public static void main(String[] args) {
		StatNonStat s=new StatNonStat();
		s.m1();
		System.out.println(s.m2());
		System.out.println(s.m3());
		System.out.println(s.m4());
		

	}

}
