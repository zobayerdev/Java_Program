package polymorphism;

public abstract class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		person p = new person();
		p.display();
		
		p = new Teacher();
		p.display();

		p = new Sturdents();
		p.display();
		
	}

}
