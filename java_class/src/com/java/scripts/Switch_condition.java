package com.java.scripts;

public class Switch_condition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Switch_condition obj = new Switch_condition();
		
		obj.switch_prog();
		

	}
	
	public void switch_prog() {
		/*
		 * switch(expression){
		 * case1:
		 * statement;
		 * break;
		 * case2:
		 * statement;
		 * break
		 * .
		 * .
		 * .
		 * casen:
		 * statement;
		 * break;
		 * 
		 * default:
		 * statement
		 * break;
		 */
		
		int day = 20;
		
		switch (day) {
		
		case 1: 
			
			System.out.println("Today is Sunday");
			
			break;
			
		case 2: 
			
			System.out.println("Today is Monday");
			
			break;
			
		case 3: 
			
			System.out.println("Today is Tuesday");
			
			break;
			
		case 4: 
	
			System.out.println("Today is Wednesday");
	
			break;
	
		case 5: 
	
			System.out.println("Today is Thursday");
	
			break;
	
		case 6: 
	
			System.out.println("Today is Friday");
	
			break;
	
		case 7: 
	
			System.out.println("Today is Saturday");
	
			break;
			
		
		default:
			
			System.out.println("Entered day is invalid");
			
			break;
		
		}
	}

}
