 package javaall;
 
 import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int count = 0;
		Scanner in = new Scanner ( System.in);
		
		System.out.println("Input Yuou Number : ");
		int num = in.nextInt();
		
	    for ( int i = 2; i<num; i++)
	    {
	    	if (num%i==0) {
	    		count++;
	    		break;
	    	}
	    }
	    
	    if(count==0)
	    {
	    	System.out.println("Prime Number");
	    } 
	    else {
	    	System.out.println("Not Prime");
	    }
	}

}
