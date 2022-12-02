package com.java.scripts;

public class Method_Overload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Method_Overload obj = new Method_Overload();
		
		obj.sbiBank("Nandha", 30, "tereterhxc street", "HYD");
		
		obj.sbiBank("Sathis", 37, "tereterdsvsdvhxc street", "BAN", "Male");

	}
	
	public void sbiBank(String name, int age, String address, String state) {
		
		System.out.println("Name is :" + name);
		System.out.println("Age is :" + age);
		System.out.println("Address is :" + address);
		System.out.println("State is :" + state);
		
	}
	
public void sbiBank(String name, int age, String address, String state, String gender) {
		
		System.out.println("Name is :" + name);
		System.out.println("Age is :" + age);
		System.out.println("Address is :" + address);
		System.out.println("State is :" + state);
		System.out.println("Gender is :" + gender);
		
	}
	
	

}
