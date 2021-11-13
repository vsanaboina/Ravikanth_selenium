package com.overloading;

public class overloading {

	public void sum(int a, int b) {
		try {
			int c = a + b;
			System.out.println(c);
		} catch (Exception e) {
			System.out.println("printed" + e.getMessage());
		}
	}

	public void sum(int a, int b, int c) {
		try {
			int d = a + b + c;
			System.out.println(d);
		} catch (Exception e) {
			System.out.println("printed " + e.getMessage());
		}
	}

	public void sum(String a, String b) {
		try {
			String value = a + b;
			System.out.println(value);
		} catch (Exception e) {

		}
	}
}