package oop;

public class Contructor {

	String name, gender;
	int phone;
	
	Contructor (){
		
	}
	
	Contructor(String n , String m){
		name =n;
		gender = m;
		
	}
	
	Contructor(String n, String m, int ph){
		name=n;
		gender =m;
		phone = ph;
	}
	
	void display()
	{
		System.out.println("Name : "+name);
		System.out.println("Gender : "+gender);
		System.out.println("Phone : "+phone);
	}

}
