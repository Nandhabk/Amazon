package com.java.scripts;

public class Second_proj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * syntax for abstraction
		 * 
		 * classname obj = new classname()
		 */
		
		Second_proj obj = new Second_proj();
		
		//obj.if_else();
		
		obj.Nestedif();
	

	}
	
	public void if_else() {
		
		int a,b;
		
		a=10;
		
		b=20;
		
		if(a>b) {
			
			System.out.println("A is greater");
		}
		
		else {
			
			System.out.println("B is greater");
		}
		
		
	}
	
// a=10;b=20;c=30
	
	
	public void Nestedif() {
		
		int a,b,c;
		
		a=40;
		b=20;
		c=50;
		
		/*
		 * Logical statements (AND or OR) AND - && (Both the conditions should be true) OR - || (any one of the statement is true)
		 */
		
		if (a>b && a>c) {
			
			System.out.println("A is greater");
			
		}
		
		else {
			
			if (b>c) {
				
				System.out.println("B is greater");
			}
			
			else {
				
				System.out.println("C is greater");
			}
		}
	}

}
