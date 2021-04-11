package javamath;

import java.util.Scanner;

public class MathJava {
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
          
		Scanner nun = new Scanner(System.in);
       
		System.out.print("Enter the side of the Triangle:");
       
		//double input newar jonno dewa hoyse
		double a= nun.nextDouble();
		
		//Eta math er jonno kora hoyese;
        double area=(Math.sqrt(3)/4)*(a*a);
        
        System.out.println("\nArea of Triangle is:  " + area); 
	}

}
