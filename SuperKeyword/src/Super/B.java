package Super;

public class B  extends Super{
	
	int x = 20 ;
	
	void display() {
		System.out.println("Sub-Class : "+x);
		System.out.println("Super_Class : "+super.x); // eikhane x = 20; Print korbe..
	}
	

}
