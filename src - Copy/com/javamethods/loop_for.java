package com.javamethods;

public class loop_for {

	public void for_loop() {
		try {
			int a[] = { 1, 2, 3, 5 };
			for (int i = 0; i <=3; i++) {
				System.out.println(a[i]);
			}
		} catch (Exception e) {
			System.out.println("This exception" + e.toString());
		}finally {
			System.out.println("finally reached");
		}

	}

}
