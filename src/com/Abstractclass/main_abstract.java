package com.Abstractclass;

public class main_abstract {

	public static void main(String[] args) {
		
		/*Banks b = new marketrate();
		b.getmarket();
		b.getmoney();
		b.samll();
		
		Banks c =new Ratemarket();
		c.getmarket();
		c.getmoney();
		c.samll();*/
		
		int_Abstarct obj1=new interstrate1();
		int x=obj1.smallintrest();
		System.out.println("value of first class "+x);
		System.out.println(obj1.intrestrate3());
		
		int_Abstarct obj2=new intrestrate2();
		int y=obj2.smallintrest();
		System.out.println("value of first class "+y);
	}

}
