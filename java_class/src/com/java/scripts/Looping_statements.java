package com.java.scripts;

public class Looping_statements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Looping_statements obj = new Looping_statements();
		
		//obj.loopstatement();
		obj.Nestedfor();
		

	}
	
	
	public void loopstatement() {
		
		/*
		 * 1 to 10 
		 * 
		 * for syntax
		 * 
		 * for (intialize; compare; increment or decrement){
		 * 
		 * Statement;
		 * 
		 * }
		 * 
		 */
		
		int a=0;
		
		for (int i=10; i>=a; i--) {   
			/*
			 * 10>=0; 9>=0; -1>=0
			 */
			
			System.out.println("Value of I is: " +  i );
		}
	}
	
	/*
	 *  00 01 02 03 10 11 12 13 20 21 22 23 30 31 32 33
	 */
	
	public void Nestedfor() {
		
		int a,b;
		
		a=3;
		b=3;
		
		for (int i=0; i<=a; i++) {
			
			for(int j=0; j<=b; j++) {
				
				/*
				 * i =0; 0<=3
				 * j=0; j<=3
				 * print 00
				 * next j will be getting increment 
				 * j=1; 1<=3
				 * 01
				 * 	* next j will be getting increment
				 * 02
				 * 
				 * j=4 ; j for loop[ willb efailed
				 * i for will get increment
				 * i=1
				 * j for loop
				 * j=0
				 * 10
				 * 11
				 * 12
				 * 13
				 * i=2
				 * 20
				 * 21
				 * 22
				 * 			 */
				
				System.out.println(i+" "+j);
				
				//System.out.println();
				
			}
		}
		
		
	}

}
