package com.javamethods;

public class methodif {

	public void methodif_int(int a) {
		int c;
		int d;
		if (a == 2) {
			System.out.println("Pass 1");
		} else if (a == 4) {
			c = a + 1;
			System.out.println("pass 2");
			System.out.println(c);
		} else {
			d = a + 2;
			System.out.println("pass 3");
			System.out.println(d);
		}
	}
}
