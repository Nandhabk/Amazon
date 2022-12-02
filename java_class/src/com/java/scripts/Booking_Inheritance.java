package com.java.scripts;

public class Booking_Inheritance extends Login_Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Booking_Inheritance obj = new Booking_Inheritance();
		
		obj.positiveLogin();
		
		obj.negativeLogin();
		
		obj.positiveBooking();
		

	}
	
	public void positiveBooking() {
		
		System.out.println("Booking is successful");
	}
	
	
	
	

}
