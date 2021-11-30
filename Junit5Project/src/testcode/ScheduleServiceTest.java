package testcode;

import static org.junit.Assume.assumeFalse;
import static org.junit.Assume.assumeTrue;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Locale;
import java.util.TimeZone;

import org.junit.jupiter.api.Test;

import businesscode.ScheduleService;

class ScheduleServiceTest {
//assuming current timezone is IST THEN Only test should continue
	@Test
	void testDoSchedule() {
		TimeZone tz=TimeZone.getDefault();
		assumeTrue(tz.getDisplayName().equals("Asia/Kolkata"));
		
		//test schedule method
		ScheduleService ss=new ScheduleService();
		assertTrue(ss.doSchedule());
	}
//
//	@Test
//	void testBackupCalendar() {
//		fail("Not yet implemented");
//	}
	
	@Test
	public void doScheduleLocaleNonUS() {

	// Assume that the current locale is US
	Locale currentLocale = Locale.getDefault();
	assumeFalse(currentLocale.equals(Locale.ENGLISH));

	// Test doSchedule method
	ScheduleService scheduleService = new ScheduleService();
	assertTrue(scheduleService.doSchedule());

	}
	
	@Test
	void testBackupCalender() {
		assumeTrue(System.getProperty("os.name").startsWith("Windows"));

		// Test doSchedule method
		ScheduleService scheduleService = new ScheduleService();
		assertTrue(scheduleService.backupCalendar());
	}
	

}
