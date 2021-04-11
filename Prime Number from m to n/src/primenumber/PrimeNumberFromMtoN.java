package primenumber;

import java .util.Scanner;

public class PrimeNumberFromMtoN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n , m, count=0;
		
		Scanner input = new Scanner ( System.in);
		
		System.out.println("Enter Your Number = ");
		m= input.nextInt();
		
		System.out.println("Enter Your Last Number : ");
		n=input.nextInt();
		
		for (int i=m; i<=n; i++)
		{
			for (int j =2 ; j<=i ; j++)
			{
				if(i%2==0) 
				{
					count++;
					break;
				}
					
			}
			if(count==0)
			{
				System.out.println(i);
			}
			count = 0;
		}
		
		

	}

}
