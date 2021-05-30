package wrapper_class;

public class StringWrapper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x = 100;
		
		
		String y = Integer.toString(x);
		
		System.out.println("y = "+x);
		
		double v = 23.90;
		String m = Double.toString(v);
		System.out.println("m = "+m);
		
		
		
		String s = "80.90";
		double n = Double.parseDouble(s);
		System.out.println("n = "+n);

	}

}
