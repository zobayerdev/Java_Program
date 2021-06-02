package oop;

public class Static_class {
	
String name ; // instance variable 
int id; // instance variable;
static String Universityname="BUBT"; //static variabel ba class veriable



Static_class(String n,int m) // constructor eta 
{
	name = n ;
	id = m;
	
}

void display() {  // display method;
	System.out.println("Name : "+name);
	System.out.println("Id : "+id);
	System.out.println("University Name : "+Universityname);
}

}









