package array;

public class ArrayOutput1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [][] number = new int[4][5];
		int k = 0;
		
		for(int row=0; row<4; row++) {
			for(int col=0; col<5; col++)
			{
				number[row][col]=k;
				k++;
			}
		}
		
		for(int row=0; row<4; row++)
		{
			for(int col=0; col<5; col++)
			{
				System.out.print(" "+number[row][col]);
			}
			System.out.println();
				
		}
		
	}

}
