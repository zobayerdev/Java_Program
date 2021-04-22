package pattern;

import java.util.Scanner;

public class PatternNumber2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input= new Scanner(System.in);
		System.out.println("Enter Your Number: ");
		int n=input.nextInt();
		
		for(int row = n; row>=1; row--)
		{
			for(int col=1; col<=row; col++)
			{
				System.out.print(" "+row);
			}
			
			System.out.println();
		}
	}

}
