package inheritance;

public class Teacher extends person {

	String qualification, passion ;
	
	void display2() {
		display1();
		System.out.println("Qualification : " +qualification);
		System.out.println("passion : "+passion);
	}

}
