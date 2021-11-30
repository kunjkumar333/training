package newfeatures;

import java.time.Clock;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class DateTimeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Legacy class to deal with date & time which is now deprecated
		Date d1=new Date();
		System.out.println(d1);
		System.out.println(d1.getDate());
		System.out.println(d1.getHours() +" : "+d1.getMinutes()+" : "+d1.getSeconds());

		//Calender class
		Calendar cal=Calendar.getInstance();
		System.out.println(cal.getTime());
		
		System.out.println("****** java 8 date & time classes******");
		
		LocalDate d=LocalDate.now(); //current date
		LocalTime t=LocalTime.now();  //current time
		LocalDateTime dt=LocalDateTime.now(); //current date and time both
		
		LocalDateTime dt2=dt.minusDays(100); //subtract 100 days to current date
		LocalDateTime dt3=dt.plusDays(30);  //adding 30 days to current date
		
		System.out.println("minus days are: "+dt2+ "  "+"plus days are : "+dt3);
		
		System.out.println("Date & Time is : "+d+" "+t);
		System.out.println(dt);
		
		DateTimeFormatter format= DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss"); //date and time in format
		String dt1=dt.format(format);
		System.out.println("After formatting : "+dt1);
		
		//Java Clock class is used to provide an access to the current, date and time using a time zone.
		Clock c1=Clock.systemDefaultZone();
		System.out.println(c1.getZone());
		
		//for getting time and date with particular zone
		Instant instant = Instant.now(); 
		ZoneId z = ZoneId.of( "Asia/Tokyo" );
		ZonedDateTime zdt = instant.atZone(z);
		System.out.println(zdt);
		
		ZonedDateTime z2=ZonedDateTime.now();
		System.out.println(z2.getZone());
		
	}

}
