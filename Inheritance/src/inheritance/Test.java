package inheritance;

public class Test {

	public static void main(String[] args) {


		Teacher t1 = new Teacher(); // teacher class er 1st object banano;
		t1.name = "Zobayer Hasan Nayem";
		t1.age = 24;
		t1.phone = 1715553688;
		t1.skill = "Coding";
		t1.qualification = "Bsc in CSE";
		t1.passion = "Programmer";
		t1.display2(); 

		System.out.println(" "); // new line print korar jonno;
		
		Teacher t2 = new Teacher();// teacher class er object create kora hoise ;
		t2.name = "Jayed";
		t2.age = 15;
		t2.phone = 1925671797 ;
		t2.skill = "Gaming" ;
		t2.qualification = "Class 7";
		t2.passion = "Gammer";
		t2.display2(); // display function call
	}

}
