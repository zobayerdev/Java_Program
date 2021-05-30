package string;

public class javapart3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub]
		String country = "bangladesh is my country";
		System.out.println(country);
		
		char ch = country.charAt(4);
		System.out.println(ch);
		
		int value = country.codePointAt(4);
		System.out.println(value);
		
		int pos = country.indexOf('n');
		System.out.println(pos);
		
		int pos2 = country.lastIndexOf('h');
		System.out.println(pos2);
		
		String s1 = "this is my country";
		System.out.println(s1);
		
		String s2 = s1.replace('i', 's');
		System.out.println(s2);

		
		String s3 = s1.replace(s2, s1);
		System.out.println("part-3 = "+s3);
		
		String[] s4 = s1.split(" ");
		for(String x : s4)
		{
			System.out.println(x);
		}
		
		 String date = String.join("-","25","06","2018");    
	     System.out.print(date); 
	}

}
