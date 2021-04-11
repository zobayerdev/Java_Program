package javaall;
import java.util.Scanner;

public class MultipaleTable {

	public static void main(String[] args) {
	
		/*
		 
		TimeTable aTimeTable = new TimeTable();
		aTimeTable.printTimeTable(12);
	    
	    */	
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter Your number : ");
	    int m = in.nextInt() ;
	    
		System.out.print("Enter Your number : ");
	    int n= in.nextInt() ;
	    
	   
// koto theke suru hobe & koto te jeye ses hobe 
	    for ( int i = m; i<=n; i++)
	    {
// eikhane namta print korbe		    
		    for ( int j = 1; j<=10; j++)
		    {
		    	System.out.println(i+" X "+j+"= "+i*j);
		    }
		    
		    System.out.println("\n\n");
	    }
	    
	    

	}

}
