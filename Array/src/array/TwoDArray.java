package array;

public class TwoDArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int a[][]=new int[2][3];
     
     a[0][0]=10;
     a[0][1]=20;
     a[0][2]=30;
     a[1][0]=40;
     a[1][1]=50;
     a[1][2]=60;
     
     for(int row = 0 ; row<2; row++)
     {
    	 for(int col=0; col<3; col++)
    	 {
    		 System.out.print("  "+a[row][col]);
    	 }
    	 System.out.println();
     }
     
	}

}
