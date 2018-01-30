package calendar;
/**
 *  This class provides a basic set of test cases for the
 *  CalDay class.
 */
import java.util.Calendar;
import java.util.GregorianCalendar;


import org.junit.Test;

import static org.junit.Assert.*;

public class CalDayTest {

	 @Test
	  public void test01()  throws Throwable  {
			GregorianCalendar today = new GregorianCalendar(2018,12,25);
			CalDay calday = new CalDay(today);
			CalDay calday1 = new CalDay();
		 int startHour=21;
 		 int startMinute=30;
 		 int startDay=15;
 		 int startMonth=01;
 		 int startYear=2018;
 		 String title="Birthday Party";
 		 String description="This is my birthday party.";
 		 //Construct a new Appointment object with the initial data
 		 Appt appt = new Appt( startHour,
 		          startMinute ,
 		          startDay ,
 		          startMonth ,
 		          startYear ,
 		          title,
 		         description);
						 calday.addAppt(appt);
						 calday.toString();
						 calday.isValid();

						  int startHour1=02;
							int startMinute1=300;
							int startDay1=15;
							int startMonth1=01;
							int startYear1=2018;
							String title1="Birthday Party";
							String description1="This is my birthday party.";
							//Construct a new Appointment object with the initial data
							Appt appt1 = new Appt(startHour1,
											 startMinute1 ,
											 startDay1 ,
											 startMonth1 ,
											 startYear1 ,
											 title1,
											description1);
											calday.addAppt(appt1);

											assertEquals(21, appt.getStartHour());
											assertEquals(30, appt.getStartMinute());
											assertEquals(15, appt.getStartDay());
											assertEquals(01, appt.getStartMonth());
											assertEquals(2018, appt.getStartYear());
											assertEquals("Birthday Party", appt.getTitle());
											assertEquals("This is my birthday party.", appt.getDescription());
											assertTrue(appt.getValid());
											assertEquals(02, appt1.getStartHour());
											assertEquals(300, appt1.getStartMinute());
											assertEquals(15, appt1.getStartDay());
											assertEquals(01, appt1.getStartMonth());
											assertEquals(2018, appt1.getStartYear());
											assertEquals("Birthday Party", appt1.getTitle());
											assertEquals("This is my birthday party.", appt1.getDescription());

	 }
	 @Test
	  public void test02()  throws Throwable  {

			GregorianCalendar today = new GregorianCalendar(2018,12,25);
			GregorianCalendar tomorrow = new GregorianCalendar(2018,12,26);
			CalDay calday = new CalDay(tomorrow);
			CalDay calday1 = new CalDay(today);
		 int startHour=21;
		 int startMinute=30;
		 int startDay=15;
		 int startMonth=01;
		 int startYear=2018;
		 String title="Birthday Party";
		 String description="This is my birthday party.";
		 //Construct a new Appointment object with the initial data
		 Appt appt = new Appt(startHour,
							startMinute ,
							startDay ,
							startMonth ,
							startYear ,
							title,
						 description);
						  calday1.addAppt(appt);
						 // calday.addAppt(appt);
						 calday.toString();
						 calday.iterator();
						 calday1.iterator();

								 Appt appt1 = new Appt(startHour,
												 startMinute ,
												 startDay ,
												 startMonth ,
												 startYear ,
												 title,
												description);
												calday1.addAppt(appt1);
												calday1.toString();
												calday1.getSizeAppts();

												assertEquals(21, appt.getStartHour());
												assertEquals(30, appt.getStartMinute());
												assertEquals(15, appt.getStartDay());
												assertEquals(01, appt.getStartMonth());
												assertEquals(2018, appt.getStartYear());
												assertEquals("Birthday Party", appt.getTitle());
												assertEquals("This is my birthday party.", appt.getDescription());

	 }

//add more unit tests as you needed
}
