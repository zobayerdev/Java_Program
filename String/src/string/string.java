package string;

public class string {

	public static void main(String[] args) {
		
		//string class er maddhome amra string kivabe nibo seta 
		String s1 = "zhn";
		System.out.println(s1);
		//string class er maddhome amra string kivabe nibo seta 	
		String s3 = new String("nayem");
				
		
		// character array niye kora
		char[] s2 = {'z','h','n'};
		System.out.println(s2);
		
		
		//2 ta string er maddhome kivabe compare korte hoy setar jonno .equals() use korte hoy;
		if(s1.equals(s3))
		{
			System.out.println("Equal");
		}else {
			System.out.println("Not equal");
		}
		
		//string er length ber kore;
		int len = s1.length();
		System.out.println(s1);
		
		//s1 epmty kina ta check kore
		boolean b = s1.isEmpty();
		System.out.println("b= "+b);
		 
		//s2 blank kina ta check kore
		boolean c = s1.isBlank();
		System.out.println(b);
		
	}

}
