package array;
import java.util.Scanner;

public class Matrix_First_Part {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input =  new Scanner(System.in);
		
		int [][] a = new int[2][3];
		int [][] b = new int[2][3];
		
		//getting user input for a;
		System.out.println("Enput input for B matrix : ");
		for (int row = 0; row<2; row++)
		{
			for(int col=0;col<3;col++)
			{
				System.out.printf("a[%d][%d] = ",row,col);
				a[row][col]=input.nextInt();
			}
		}
		
		//Printing input for a;
		System.out.println("Result : ");
		for (int row = 0; row<2; row++)
		{
			for(int col=0;col<3;col++)
			{
				System.out.print("\t"+a[row][col]);
			}
			System.out.println( );
		}
		
		
		//getting user input for b;
		System.out.println("Enput input for A matrix : ");
		for (int row = 0; row<2; row++)
		{
			for(int col=0;col<3;col++)
			{
				System.out.printf("b[%d][%d] = ",row,col);
				b[row][col]=input.nextInt();
			}
		}
		
		//Printing input for b;
		System.out.println("Result : ");
		for (int row = 0; row<2; row++)
		{
			for(int col=0;col<3;col++)
			{
				System.out.print("\t"+b[row][col]);
			}
			System.out.println( );
		}
		

		//adding a and b;
System.out.println("\n\n");
		System.out.println("A+B = ");
for(int row = 0; row<2; row++)
{
	for(int col = 0; col<3; col++) {
		
		System.out.print(" \t "+(a[row][col]+b[row][col]));
	}
	System.out.println();
}
	}

}
