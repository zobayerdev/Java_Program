package final_keyword;

public class final_keyword {

	final String universityname = "BUBT"; // eta change hobe na ar tai eikhane rekhe disi .final bole
	static final int fees ; // final blank variable ke constructor dara intial korte hobe;
	
	static {
		fees = 2000 ;
	}
	
	void display() {
		System.out.println("University Name : "+universityname);
		System.out.println("Fee  : "+fees);
	}
	
	void display2() {
		System.out.println(" ");
		System.out.println("University Name : "+universityname);
		System.out.println("Fee  : "+fees);
		
	}
}
