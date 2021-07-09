package Anonymous;

public class Test {

	public static void main(String[] args) {

		person p = new person() { // anonymous class 
			
			@Override
			void display() {
				System.out.println("test class");
			
			}
		};

		p.display();
	}

}
