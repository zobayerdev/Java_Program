package instance;

public abstract class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Animal a = new Animal();
		person p = new person();
		teacher t = new teacher();

		System.out.println(t instanceof Animal);
        System.out.println(p instanceof Animal);
		
		
	}

}
