package com.testng.sele1;

public class ReverseaString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a = "Welcome to India";
		
		// India to Welcome
		
		// need to convert this into array
		
		char[] ch = a.toCharArray();
		
		System.out.println(ch.length);
		
		for (int i = ch.length-1;i>=0;i--) {
			
			System.out.print(ch[i]);
		}

	}
	
	/*
	 * a=10;
	 * b=20;
	 * 
	 * a=20;
	 * b=10;
	 */

}
