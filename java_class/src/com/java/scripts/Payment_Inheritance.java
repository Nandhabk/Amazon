package com.java.scripts;

public class Payment_Inheritance extends Booking_Inheritance{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Payment_Inheritance obj = new Payment_Inheritance();
		
		obj.positiveLogin();
		
		obj.positiveBooking();
		
		obj.positivepayment();

	}
	
	public void positivepayment() {
		
		System.out.println("Payment is successfull");
	}

}
