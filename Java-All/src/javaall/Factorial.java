package javaall;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner (System.in);
		int fact =1;
		System.out.print("Enter Your Number Intiger : ");
		int num = in.nextInt();
		
		for(int i = num; i>=1; i--)
		{
			fact *= i;
		}
		
		System.out.print("Your Factorial : "+fact);
	}

}
