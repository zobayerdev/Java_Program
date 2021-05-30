package string;

public class StringBUffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = "zhn";
		StringBuffer sb = new StringBuffer(s1);
		
		System.out.println(sb);
		
		sb.append(" 25 ");
		System.out.println(sb);
		
		sb.setLength(5);
		System.out.println(sb);
		
		

	}

}
