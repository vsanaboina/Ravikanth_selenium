package com.overridingandinheritence;

public class overridingmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		overridingsuperclass obj1 = new overridingsuperclass();
		System.out.println(obj1.getintrest());
		
		overridingsubclass obj2 = new overridingsubclass();
		System.out.println(obj2.getintrest());
		
		
		obj1.click();
		obj2.click();
		
		obj1.getintrest1();
		obj2.getintrest1();
	}

}
