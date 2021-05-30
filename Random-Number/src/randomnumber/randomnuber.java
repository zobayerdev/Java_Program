package randomnumber;

import java.util.Random;

public class randomnuber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random rand = new Random();
		
		int randomnumber = rand.nextInt(10)+1;
		
		System.out.println("random Number  :" +randomnumber);

	}

}
