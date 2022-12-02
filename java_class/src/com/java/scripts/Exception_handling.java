package com.java.scripts;

public class Exception_handling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * 
		 * I have written 100 lines of codes
		 * 
		 * I have my error at 50th line (i need to supress this error and I need to execute the other lines)
		 * 
		 * To handle the known error.
		 * 
		 * try catch
		 * 
		 * try{
		 * statement;
		 * }
		 * catch (Exception e1){
		 * sysout
		 * }
		 */
		
		Exception_handling obj = new Exception_handling();
		
		obj.arithmetic_error();
		
		obj.nullpointer();
		

	}
	
	public void arithmetic_error() {
		
		int a,b;
		
		a=10;
		b=0;
		
		try {
		
		System.out.println(a/b);
		
		}
		
		catch (Exception e1) {
			
			System.out.println(e1);
		}
	}
	
	public void nullpointer() {
		
		String v1 = null;
		
		try {
		
		System.out.println(v1.length());
		
		}
		
		catch (Exception e1) {
			
			System.out.println("Exception is :" + e1 );
		}
	}

}
