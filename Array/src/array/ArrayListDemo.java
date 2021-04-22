package array;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		int n,m=0;
		ArrayList<Integer> number = new ArrayList<Integer>();
		System.out.println("Size:  "+number.size());
		
		
		number.add(10);
		number.add(20);
		number.add(2,40);
		number.add(50);
		number.add(60);
		number.add(80);
		number.add(90);
		number.add(100);
		number.add(101);
		number.add(103);
		
		//System.out.println("Size : "+number);
	    /*	for(int x : number) {
			System.out.print(" "+x);
		}
	    	
	    
		//Iteration Method 
		System.out.println("\n");
		Iterator itr = number.iterator();
	    while(itr.hasNext()) {
	    	System.out.print(" "+itr.next());
	    }
	    
	    */
	   
	    
	    //Removing Array
	   
	    //number.remove(2);
	    //System.out.println("After Removing : "+number);
	    
	    //number.removeAll(number);
	   // System.out.println("After Remove All number : "+number); 
		System.out.println("Data: "+number);
	    System.out.println("Enter Your Value: ");
		m=input.nextInt();
		int pos=number.indexOf(m);
		for(int i =0; i<=pos; i++) {
			System.out.println("index is: "+pos);
			break;
		}
	    System.out.println(" ");
	    
	    
		
		System.out.println("\nData : "+number);
	    System.out.println("Which Index do you Remove : ");
	    n = input.nextInt();
	    number.remove(n);
	    for (int j = 0; j <=n; j++)
	    {
	    	System.out.println("Remove Data : "+number);
	    	break;
	    }
	    
	    System.out.println();
	    	    
	    
	    //.clear er rule
	   /* number.clear();
	    System.out.println("\nclear number :  "+number);
	    
	    //isEpty er 
	    boolean check = number.isEmpty();
	    System.out.println("Array List Is Empty: "+check);*/
	    
	    
	    boolean contain = number.contains(100);
	    System.out.printf(" 100 Is in List "+contain);
	    

	}

}
