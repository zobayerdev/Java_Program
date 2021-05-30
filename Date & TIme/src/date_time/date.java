package date_time;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class date {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Date date = new Date();
		
		//System.out.println(date);
		
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/YYYY");
		
		String currentDate = dateFormat.format(date);
		System.out.println("Date : " +currentDate);

	}

}
