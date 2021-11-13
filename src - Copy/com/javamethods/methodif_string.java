package com.javamethods;

public class methodif_string {
	
	public void method_string(String value){
		
		if(value=="ravi"){
			System.out.println("pass 1");
			System.out.println(value);
		}else if(value=="kiran"){
			System.out.println(value+" "+"original");
			System.out.println("pass 4");
		}
		else{
			value = "sai";
			System.out.println(value);
		}
			
	}

}
