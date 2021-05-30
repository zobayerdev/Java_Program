package oop;

public class oopclassobject {

	String name, gender ;
	int phone;
	
	oopclassobject(String n, String m, int ph){  //oopclassobject eta constractor eta class er name e korte hobe ;
		
		name =n;
		gender = m;
		phone =ph;
	}
	
	/*void setInformation(String n , String m, int ph)
	{
		name = n ;
		gender = m;
		phone = ph;
	}*/
	
	void display()
	{
		
		
		System.out.println("Name : "+name);
		System.out.println("Gender : "+gender);
		System.out.println("Phone : "+phone);
		System.out.println("\n");
		
		/*
		 eikhane kisu print korte hole object diye dite hobe na 
		 karon ei class er object main function e create kora ase
		 fole jar karone just class er template ba variavle use 
		 korlei dilei kaj hobe.  
		 
		 */
		
	}
}
