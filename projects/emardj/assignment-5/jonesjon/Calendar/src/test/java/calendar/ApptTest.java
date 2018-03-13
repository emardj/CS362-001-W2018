package calendar;
/**
 *  This class provides a basic set of test cases for the
 *  Appt class.
 */
import org.junit.Test;

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
			appt.setRecurrence(null,4,7,5);
			assertEquals(0, appt.getRecurDays());
			appt.setRecurrence(i,4,7,5);
			appt.getValid();


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

		 int[] a = new int[]{1,2,4};
		 Appt appt1 = new Appt(1,1,1,1,2018, "Party", "my house");
		 appt1.setRecurrence(a, 1,1,1);

		 assertTrue(appt1.isRecurring());

		 for(int k = 0; k < 3; k++){

			 assertEquals(a[k], appt1.getRecurDays()[k]);
		 }
		 assertEquals(1, appt1.getRecurNumber());
		 assertEquals(1, appt1.getRecurBy());
		 assertEquals(1, appt1.getRecurIncrement());

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
   // System.out.println(appt.toString());

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
					// System.out.println(appt.toString());
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

	 						startHour=25;
	 						startMinute=36;
	 						startDay=20;
	 						startMonth=04;
	 						startYear=2020;
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

	 										assertEquals(0, appt.compareTo(appt));
	 										assertEquals(20,appt1.compareTo(appt));

	 					}
	 	@Test
	 	public void test07()  throws Throwable  {
	 					Appt appt = new Appt(05,02,13,10,2014, "test", "this is a test");

	 					appt.setStartMinute(-1);
	 					assertFalse(appt.getValid());
	 					appt.setStartMinute(32);
	 					assertTrue(appt.getValid());

	 					appt.setStartDay(-1);
	 					assertFalse(appt.getValid());
	 					appt.setStartDay(3);
	 					assertTrue(appt.getValid());


	 					Appt max = new Appt(23,59,13,12,2014, "test", "this is a test");
	 					assertTrue(max.getValid());
	 					Appt max1 = new Appt(12,59,13,12,2014, "test", "this is a test");
	 					assertTrue(max1.getValid());
	 					Appt max2 = new Appt(23,30,31,01,2014, "test", "this is a test");
	 					assertTrue(max2.getValid());
	 					Appt max3 = new Appt(20,40,13,12,2014, "test", "this is a test");
	 					assertTrue(max3.getValid());

	 					Appt max4 = new Appt(0,59,13,12,2014, "test", "this is a test");
	 					assertTrue(max4.getValid());
	 					Appt max5 = new Appt(12,0,13,12,2014, "test", "this is a test");
	 					assertTrue(max5.getValid());
	 					Appt max6 = new Appt(15,30,1,01,2014, "test", "this is a test");
	 					assertTrue(max6.getValid());
	 					Appt max7 = new Appt(20,40,10,1,2014, "test", "this is a test");
	 					assertTrue(max7.getValid());

	 					 }

	 					 @Test
	 				 	public void test08()  throws Throwable  {

	 										Appt appt = new Appt(1,1,1,1,2017, "test", "this is a test");
	 										String dates = "\t1/1/2017 at 1:1am ,test, this is a test\n";
	 										assertEquals(dates, appt.toString());

	 										Appt appt1 = new Appt(13,1,1,1,2017, "test", "this is a test");
	 										String dates1 = "\t1/1/2017 at 1:1pm ,test, this is a test\n";
	 										assertEquals(dates1, appt1.toString());


	 										Appt appt2 = new Appt(11,1,1,1,2017, "test", "this is a test");
	 										String dates2 = "\t1/1/2017 at 11:1am ,test, this is a test\n";
	 										assertEquals(dates2, appt2.toString());

	 										Appt appt3 = new Appt(0,1,1,1,2017, "test", "this is a test");
	 										String dates3 = "\t1/1/2017 at 12:1am ,test, this is a test\n";
	 										assertEquals(dates3, appt3.toString());
	 					}
	 //add more unit tests as you needed

	 }
