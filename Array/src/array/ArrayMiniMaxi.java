package array;
import java.util.Scanner;
public class ArrayMiniMaxi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		int num []= new int[100];
		
		System.out.println("Enter Number : ");
		int n = input.nextInt();
		int max=num[0];
		int min=num[0];
		
		for(int i=1; i<n; i++)
		{
			num[i]=input.nextInt();
		}
		
		for(int i = 1; i<10; i++)
		{
			if(num[i]<min) min = num[i];
			if(num[i]>max) max= num[i];
		}
		
		System.out.println("Max and Min : " + max+" "+min);
		
	}

}
