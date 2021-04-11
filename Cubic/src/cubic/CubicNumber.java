/*
 * Compute the number of cubic inches in 1 cubic mile
 */
package cubic;
import java.util.Scanner;

public class CubicNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		Scanner  none=  new Scanner ( System.in);
		int n ; 
		long ci;
		long im;
		
		System.out.print("Your Input : ");
		n = none.nextInt();
		
		im =(n*(5280*12));
		
		System.out.println("Im = "+n+" * 5280 * 12 = "+im);
		
		ci = im * im * im;
		
		System.out.println("There Are "+ci+" cubic inches in Cubic mile");
	}

}
