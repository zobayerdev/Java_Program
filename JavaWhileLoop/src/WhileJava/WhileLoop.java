package WhileJava;

import java.util.Scanner;

public class WhileLoop {

	public static void main(String[] args) {
		
		
		Scanner num = new Scanner(System.in);
	
		//Input First Value
		System.out.print("Enter Your Starting Point: ");
		int F = num.nextInt();
		
		//Input Last Value
		System.out.print("Enter Your Stopped Point: ");
		int L = num.nextInt();
		
		System.out.println("\nYour starting Number Below");
		
		//Function Create
		while(F<=L) {
			
			System.out.println(+F);
			F = F+2;
			
		}
		
		System.out.println("Thank You.");
	}

}
