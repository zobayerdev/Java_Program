package even;

import java . util. Scanner;

public class Even {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		Scanner input = new Scanner (System.in);
		int sum=0;
		for (int i=1 ;  i<=10; i++)
		{
			 sum = sum+i;
		}
		
		System.out.println("The Sum : "+sum);
		
		
		// user number
		int m ,n;
		int num = 0;
	   System.out. print("Enter Your NUMBER :  ");
	   m = input.nextInt();
	   
	   System.out.print("Enter Last Number : ");
	   n = input.nextInt();
	   
	   for ( int i=m; i<=n; i++)
	   {
		   num = num + i;
	   }
	   
	   System.out.println("Your result : " +num);
	}
	


}
