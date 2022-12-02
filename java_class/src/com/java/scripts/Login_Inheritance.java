package com.java.scripts;

public class Login_Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Login_Inheritance obj = new Login_Inheritance();
		
		obj.positiveLogin();
		
		obj.negativeLogin();

	}
	
	public void positiveLogin() {
		
		System.out.println("Login is successfull");
	}
	
	public void negativeLogin() {
		
		System.out.println("Login is Failed");
	}
	
	public void loginstatus() {
		
		negativeLogin();
		
	}

}
