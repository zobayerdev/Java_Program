package pattern;

import java.util.Scanner;

public class PatternNumbering1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input= new Scanner(System.in);
		System.out.println("Enter Your Number: ");
		int n=input.nextInt();
		
		for(int row = 1; row<=n; row--)
		{
			for(int col=1; col<=row; col++)
			{
				System.out.print(" "+col);
			}
			
			System.out.println();
		}

	}

}
