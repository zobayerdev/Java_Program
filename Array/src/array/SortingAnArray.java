package array;

import java.util.Arrays;

public class SortingAnArray {

	public static void main(String[] args) {
	
		int a [] = {10,-10,20,5,3,40};
	
		Arrays.sort(a);
		
		System.out.println("Assending:");
		for(int i = 0; i<=5; i++) {
			System.out.print(" "+a[i]);
		}

		
		System.out.println("\n\nDessending: ");
		for(int i=5; i>=0; i--) {
			System.out.print(" "+a[i]);
		}
		
		
		
		//Assending in String;
		String names []= {"nayem","muin","noman"};
		
		Arrays.sort(names);
		System.out.println("Assending: ");
		for(int k= 0; k<=2; k++) 
		{
			
			System.out.print(" "+names[k]);
		}
		
		//Descending order;
		System.out.println("\n\nDescending: ");
		for(int k=2; k>=0 ; k--) 
		{
			
			System.out.print(" "+names[k]);
		}
		
		
		String [] name = new String[5];
		
		name[0]="nayem";
		name[1]="muin";
		name[2]="noman";
		name[3]="poly";
		name[4]="hasan";
		
		Arrays.sort(name);
		
		System.out.println("\n\n\nAssending : ");
		
		for(int j = 0; j<=4; j++) {
			System.out.print(" "+name[j]);
		}
		
	}

}
          