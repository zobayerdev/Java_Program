package javaall;

import java.util.Scanner;

public class DotSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 double sum = 0;
		 Scanner in = new Scanner(System.in);
	     
	     
	     System.out.print("Enter You Last Number : ");
	     double n = in.nextDouble();
	    
	     for (double i=1.5; i<=n; i++)
	     {
	    	 System.out.print(i+ " ");
	    	 sum = sum + i;
	     }
	     System.out.println();
	     System.out.println("Result : " +sum);
	}

}
