package polymorphism;

public class Test2 {

	public static void main(String[] args) {
        
		/*shape s = new shape();
		
		s = new Traingle(70,30);
		System.out.println(s.area());
		
		s = new Ractangle(20,30);
		System.out.println(s.area()); 
		
		*/
		
		shape[] s = new shape[3];
		
		s[0] = new shape();
		s[1] = new Traingle(30,90);
		s[2]= new Ractangle(10,90);
		
		for(int i=0; i<3; i++)
		{
			System.out.println(s[i].area());
		}
		
		
		
		
		
	}

}
