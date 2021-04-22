package array;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int [] number = new int[10];
       int number2[]=new int[30];
       
       number[0]=10;
       number[1]=20;
       number[2]=40;
       
       int sum= number[0]+number[1]+number[2];
       
       System.out.println(" Sum Of Array: " +sum);
       
       int len = number.length;
       int len2=number2.length;
       System.out.println(" "+len2);
	}

}
