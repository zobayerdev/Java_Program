package oop;

public class Testconstructor {

	public static void main(String[] args) {

		Contructor teacher1 = new Contructor ();
		
		Contructor teacher2 = new Contructor("zobayer","Male");
		teacher2.display();
		
		
		Contructor teacher3 = new Contructor("Zayed","Male",1715553688);
		teacher3.display();
		
		
		Contructor ob1 = new Contructor();
		
		
		System.out.println("Square of  = "+ob1.square(9));
	}

}
