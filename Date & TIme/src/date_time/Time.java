package date_time;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Time {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LocalTime time = LocalTime.now();
		
	
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm:ss");
		
		String timeformat = time.format(formatter);
		
		System.out.println(" Time  : " +time );

	}

}
