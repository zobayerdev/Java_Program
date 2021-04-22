package array;

import java.util.Scanner;
public class ArraySumAvarege {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	Scanner input=new Scanner(System.in);
	double[]number=new double[10];
	double sum = 0;
	System.out.println("Please Enter Numbers & What Do you want Indexing Box: ");
	int n = input.nextInt();
	
	for(int i = 0 ; i<n ; i++ )
	{
		number[i]=input.nextDouble();
	}
	
	for (int i = 0; i<n ; i++)
	{
		sum = sum + number [i];
	}
	
	System.out.println("Results : "+sum);
	
	double avg = sum/n;
	
	System.out.println("REsults : "+avg);
	
	}

}
