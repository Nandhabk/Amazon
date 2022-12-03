package com.selenium.prog1;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stubr
		
		String a = "welcome to india";
		
		char[] ch = a.toCharArray();
		
		for(int i=a.length()-1;i>=0;i--) {
			
			System.out.print(ch[i]);
		}
		
		

	}

}
