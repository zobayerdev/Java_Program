package javaall;

import java . util. Scanner;

public class Series_01 {

	public static void main(String[] args) {
		
		 int sum = 0;
		 Scanner input = new Scanner(System.in);
	     
	     
	     System.out.print("Enter You Last Number : ");
	     int n = input.nextInt();
	    
	     for (int i=1; i<=n; i++)
	     {
	    	 System.out.print(i + " ");
	    	 sum = sum + i;
	     }
	     System.out.println();
	     System.out.println("Result : " +sum);
	
	}

}
