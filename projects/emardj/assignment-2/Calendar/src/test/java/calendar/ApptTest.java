package calendar;
/**
 *  This class provides a basic set of test cases for the
 *  Appt class.
 */
import org.junit.Test;
/*
 * CalendarMain.java
 *  Adapted from  Paul Miles
 */
import java.util.Calendar;
import java.util.Collections;
import java.util.GregorianCalendar;
import java.util.LinkedList;

import static org.junit.Assert.*;
public class ApptTest {
    /**
     * Test that the gets methods work as expected.
     */
	 @Test
	  public void test01()  throws Throwable  {
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
	// assertions
		 assertTrue(appt.getValid());
		 assertEquals(21, appt.getStartHour());
		 assertEquals(30, appt.getStartMinute());
		 assertEquals(15, appt.getStartDay());
		 assertEquals(01, appt.getStartMonth());
		 assertEquals(2018, appt.getStartYear());
		 assertEquals("Birthday Party", appt.getTitle());
		 assertEquals("This is my birthday party.", appt.getDescription());
	 }

//tests if the input catches when something is not valid
	 @Test
	  public void test02()  throws Throwable  {
			int startHour=21;
			int startMinute=-1;
			int startDay=03;
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

			int recurNumber = 5;
			int[] i ={2,3,4};
			appt.setRecurrence(i,4,7,5);
			appt.getValid();

		//assertions
 		 assertEquals(21, appt.getStartHour());
 		 assertEquals(-1, appt.getStartMinute());
 		 assertEquals(03, appt.getStartDay());
 		 assertEquals(01, appt.getStartMonth());
 		 assertEquals(2018, appt.getStartYear());
 		 assertEquals("Birthday Party", appt.getTitle());
 		 assertEquals("This is my birthday party.", appt.getDescription());
		 assertEquals(4, appt.getRecurBy());
		 assertEquals(7, appt.getRecurIncrement());
		 assertEquals(5, appt.getRecurNumber());

	 }

@Test
 public void test03()  throws Throwable  {
	 int startHour=21;
	 int startMinute=30;
	 int startDay=15;
	 int startMonth=01;
	 int startYear=2018;
	 String title=null;
	 String description=null;
	 //Construct a new Appointment object with the initial data
	 Appt appt = new Appt(startHour,
						startMinute ,
						startDay ,
						startMonth ,
						startYear ,
						title,
					 description);
		int recurNumber = 5;
	 int[] i =null;

	 appt.setRecurrence(i,4,7,5);
	 appt.isRecurring();
   System.out.println(appt.toString());

	 // assertEquals(3, appt.getRecurDays());
	 assertEquals(4, appt.getRecurBy());
	 assertEquals(7, appt.getRecurIncrement());
	 assertEquals(5, appt.getRecurNumber());
	 assertTrue(appt.getValid());
	 assertEquals(21, appt.getStartHour());
	 assertEquals(30, appt.getStartMinute());
	 assertEquals(15, appt.getStartDay());
	 assertEquals(01, appt.getStartMonth());
	 assertEquals(2018, appt.getStartYear());
	 assertEquals("", appt.getTitle());
	 assertEquals("", appt.getDescription());

}

@Test
 public void test04()  throws Throwable  {

	 int startHour=0;
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
					System.out.println(appt.toString());

					assertEquals(0, appt.getStartHour());
					assertEquals(30, appt.getStartMinute());
					assertEquals(15, appt.getStartDay());
					assertEquals(01, appt.getStartMonth());
					assertEquals(2018, appt.getStartYear());
					assertEquals("Birthday Party", appt.getTitle());
					assertEquals("This is my birthday party.", appt.getDescription());

 }

 @Test
  public void test05()  throws Throwable  {

 	 int startHour=02;
 	 int startMinute=30;
 	 int startDay=-2;
 	 int startMonth=01;
 	 int startYear=2018;
 	 String title=null;
 	 String description="This is my birthday party.";
 	 //Construct a new Appointment object with the initial data
 	 Appt appt = new Appt(startHour,
 	 				 startMinute ,
 	 				 startDay ,
 	 				 startMonth ,
 	 				 startYear ,
 	 				 title,
 	 				description);
					System.out.println(appt.toString());
					appt.setStartDay(20);

					assertEquals(02, appt.getStartHour());
					assertEquals(30, appt.getStartMinute());
					assertEquals(20, appt.getStartDay());
					assertEquals(01, appt.getStartMonth());
					assertEquals(2018, appt.getStartYear());
					assertEquals("", appt.getTitle());
					assertEquals("This is my birthday party.", appt.getDescription());
  }

	@Test
	 public void test06()  throws Throwable  {
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

						startHour=22;
						startMinute=30;
						startDay=15;
						startMonth=01;
						startYear=2018;
						title="Birthday Party";
						description="This is my birthday party.";
						//Construct a new Appointment object with the initial data
						Appt appt1 = new Appt(startHour,
										 startMinute ,
										 startDay ,
										 startMonth ,
										 startYear ,
										 title,
										description);
										appt.compareTo(appt1);

										assertEquals(21, appt.getStartHour());
										assertEquals(30, appt.getStartMinute());
										assertEquals(15, appt.getStartDay());
										assertEquals(01, appt.getStartMonth());
										assertEquals(2018, appt.getStartYear());
										assertEquals("Birthday Party", appt.getTitle());
										assertEquals("This is my birthday party.", appt.getDescription());
										assertTrue(appt.getValid());
										assertEquals(22, appt1.getStartHour());
										assertEquals(30, appt1.getStartMinute());
										assertEquals(15, appt1.getStartDay());
										assertEquals(01, appt1.getStartMonth());
										assertEquals(2018, appt1.getStartYear());
										assertEquals("Birthday Party", appt1.getTitle());
										assertEquals("This is my birthday party.", appt1.getDescription());
					}
//add more unit tests as you needed

}
