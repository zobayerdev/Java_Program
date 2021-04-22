package array;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> number = new ArrayList<Integer>();
		
		number.add(20);
		number.add(-3);
		number.add(-4);
		number.add(90);
		
		System.out.println(number);
		
		Collections.sort(number);
		System.out.println("Assending Sort: "+number);
		
		
		Collections.sort(number, Collections.reverseOrder());
		System.out.println("Decending: "+number);
		
		

	}

}
