package Abstract;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MobileUser ms ; // abstract class er refference value eta
		
		ms = new Rahim(); // reference value diye subclass ke call dewa jay
		ms.call();
		ms.sendMassage();
		
		ms = new Karim();
		ms.sendMassage();
		
	}

}
