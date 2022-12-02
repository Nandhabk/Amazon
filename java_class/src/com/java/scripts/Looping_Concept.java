package com.java.scripts;

public class Looping_Concept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Looping_Concept obj = new Looping_Concept();
		
		obj.while_loop();
		
		obj.do_while();

	}
	
	public void while_loop() {
		
		/*
		 * while (condition){
		 * statement
		 * increment or decrement;
		 * }
		 */
		
		int a=10;
		int i =0;
		
		while (i<a) {
			System.out.println("Value of I is :" + i);
			
			i++;
			
		}
		
		System.out.println("------------------------------");
	}
	
	/*
	 * while it checks the condition first and then execute the statement
	 * 
	 * do while it execute the statement once, then it will check the condition
	 */
	
	public void do_while() {
		
		int a=10;
		int i=11;
		
		do {
			
			System.out.println("value of I is :" + i);
			
			i++;
			
		} while (i<a);
	}

}
