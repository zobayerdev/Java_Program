/*
 * Use the Pythagorean theorem to find the Length of
 * the hypotenuse giving the length of the two opposing sides.
 */
package DoubleData;

import java.util.Scanner;

public class DoubleDataType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner none = new Scanner(System.in);
		
		double x,y,z;
		
		System.out.println("Enter X = ");
		x = none.nextDouble();
		
		System.out.println("Enter Y = ");
		y = none.nextDouble();
		
		z = Math.sqrt(x*x + y*y);
		
		System.out.println("Hypotenuse is : "+z);

	}

}
