package com.java.scripts;

public class ArrayProg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayProg obj = new ArrayProg();
		
		obj.mularray();
	}
	
	public void mark() {
		
		int a[] = new int[5];
		
		a[0]=10;
		a[1]=20;
		
		a[3]=50;
		a[4]=70;
		
		
		for (int i=0; i<a.length;i++) {
			System.out.println(a[i]);
		}
		
		
	}
	
	public void mark1() {
		
		int a[] = {30,20,40,80,60,10};
		
		System.out.println(a.length);
		
		/*for (int i=0; i<a.length;i++) {
			
			System.out.println(a[i]);
		}*/
		
		for(int i : a) {
			
			System.out.println(i);
		}
		
	}
	
	public void mularray() {
		
		int a[][]=new int [3][3];
		a[0][0]=10;
		a[0][1]=20;
		a[0][2]=30;
		a[1][0]=10;
		a[1][1]=20;
		a[1][2]=30;
		a[2][0]=10;
		a[2][1]=20;
		a[2][2]=30;
		
		for (int i=0; i<3; i++) {
			for(int j=0;j<3;j++) {
				System.out.println(a[i][j]);
			}
		}
		
	}
	
	public void muldiarray() {
		
		int a[][] = {{2,2,3},{2,4,5}};
	}

}
