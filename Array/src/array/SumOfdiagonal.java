package array;
import java.util.Scanner;

public class SumOfdiagonal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int[][] a = new int [ 3][3];
		int SDE=0;
		int SUP=0;
		int SLP=0;
	//Matrix Input	
		for (int row=0; row<3; row++)
			
		{
			for(int col=0; col<3; col++)
			{
				a[row][col]= input.nextInt();
			}
		}
//Diagonal Upper Lower;		
for (int row=0; row<3; row++)
			
		{
			for(int col=0; col<3; col++)
			{
				if(row==col)
				{
					SDE=SDE+a[row][col];
				}
				
				if(row<col)
				{
					SUP=SUP+a[row][col];
				}
				
				if(row>col)
				{
					SLP=SLP+a[row][col];
				}
				
			}
		}

System.out.println("SDE= "+SDE);
System.out.println("SUP= "+SUP);
System.out.println("SLP= "+SLP);
	}

}
