package calendar;
/**
 *  This class provides a basic set of test cases for the
 *  TimeTable class.
 */
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.LinkedList;
import java.util.List;


import org.junit.Test;

import static org.junit.Assert.*;

public class TimeTableTest {

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

							startHour=15;
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
	 // assertions
			GregorianCalendar today = new GregorianCalendar(2018,12,25);
			GregorianCalendar someday = new GregorianCalendar(2018,10,23);
			LinkedList<Appt> listAppts = new LinkedList<Appt>();
			CalDay cal = new CalDay(today);
			TimeTable timetable = new TimeTable();

			timetable.getApptRange(listAppts,today,someday);
			listAppts = timetable.deleteAppt(null, null);
			assertNull(listAppts);
			assertEquals(21, appt.getStartHour());
			assertEquals(30, appt.getStartMinute());
			assertEquals(15, appt.getStartDay());
			assertEquals(01, appt.getStartMonth());
			assertEquals(2018, appt.getStartYear());
			assertEquals("Birthday Party", appt.getTitle());
			assertEquals("This is my birthday party.", appt.getDescription());


			assertEquals(15, appt1.getStartHour());
			assertEquals(30, appt1.getStartMinute());
			assertEquals(15, appt1.getStartDay());
			assertEquals(01, appt1.getStartMonth());
			assertEquals(2018, appt1.getStartYear());
			assertEquals("Birthday Party", appt1.getTitle());
			assertEquals("This is my birthday party.", appt1.getDescription());


	 }
	 @Test
	  public void test02()  throws Throwable  {

LinkedList<Appt> listAppts = new LinkedList<Appt>();//for linked list of appointments
			//create first appt
			int startHour=15;
			int startMinute=30;
			int startDay=15; //this day is 14th
			int startMonth=01; //its January
			int startYear=2018; //its 2018
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
							listAppts.add(appt);
//create second appt1
							startHour=14;
							startMinute=30;
							startDay=14;
							startMonth=01;
							startYear=2018;
							title="Class";
							description="This is my birthday party.";
							//Construct a new Appointment object with the initial data
							appt = new Appt(startHour,
											 startMinute ,
											 startDay ,
											 startMonth ,
											 startYear ,
											 title,
											description);
											listAppts.add(appt);

											//create second appt1
																		startHour=13;
																		startMinute=30;
																		startDay=14;
																		startMonth=01;
																		startYear=2018;
																		title="meeting";
																		description="This is my birthday party.";
																		//Construct a new Appointment object with the initial data
																		appt = new Appt(startHour,
																						 startMinute ,
																						 startDay ,
																						 startMonth ,
																						 startYear ,
																						 title,
																						description);
																						listAppts.add(appt);
																						//create second appt1
																													startHour=16;
																													startMinute=30;
																													startDay=15;
																													startMonth=02;
																													startYear=2018;
																													title="visit";
																													description="This is my birthday party.";
																													//Construct a new Appointment object with the initial data
																													appt = new Appt(startHour,
																																	 startMinute ,
																																	 startDay ,
																																	 startMonth ,
																																	 startYear ,
																																	 title,
																																	description);
																																	int[] recurDaysArr = {2,3,4};
																																	appt.setRecurrence( recurDaysArr, 1, 2, 1000);
																																	listAppts.add(appt);

																																	GregorianCalendar today = new GregorianCalendar(2018,01,14);
																																	GregorianCalendar tomorrow = new GregorianCalendar(2018, 01,25);
			TimeTable timeTable=new TimeTable();
			LinkedList<CalDay> calDays = new LinkedList<CalDay>();
			calDays = new LinkedList<CalDay>();
			calDays = timeTable.getApptRange(listAppts,today,tomorrow);

			assertEquals(16, appt.getStartHour());
			assertEquals(30, appt.getStartMinute());
			assertEquals(15, appt.getStartDay());
			assertEquals(02, appt.getStartMonth());
			assertEquals(2018, appt.getStartYear());
			assertEquals("visit", appt.getTitle());
			assertEquals("This is my birthday party.", appt.getDescription());
	 }

	 @Test
	 public void test03()  throws Throwable  {
		 LinkedList<Appt> listAppts = new LinkedList<Appt>();//for linked list of appointments
		 			//create first appt
		 			int startHour=15;
		 			int startMinute=30;
		 			int startDay=15; //this day is 14th
		 			int startMonth=01; //its January
		 			int startYear=2018; //its 2018
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
		 							listAppts.add(appt);
		 //create second appt1
		 							startHour=14;
		 							startMinute=30;
		 							startDay=14;
		 							startMonth=01;
		 							startYear=2018;
		 							title="Class";
		 							description="This is my birthday party.";
		 							//Construct a new Appointment object with the initial data
		 							appt = new Appt(startHour,
		 											 startMinute ,
		 											 startDay ,
		 											 startMonth ,
		 											 startYear ,
		 											 title,
		 											description);
		 											listAppts.add(appt);

		 											//create second appt1
		 																		startHour=13;
		 																		startMinute=30;
		 																		startDay=14;
		 																		startMonth=01;
		 																		startYear=2018;
		 																		title="meeting";
		 																		description="This is my birthday party.";
		 																		//Construct a new Appointment object with the initial data
		 																		appt = new Appt(startHour,
		 																						 startMinute ,
		 																						 startDay ,
		 																						 startMonth ,
		 																						 startYear ,
		 																						 title,
		 																						description);
		 																						listAppts.add(appt);
		 																						//create second appt1
		 																													startHour=16;
		 																													startMinute=30;
		 																													startDay=15;
		 																													startMonth=02;
		 																													startYear=2018;
		 																													title="visit";
		 																													description="This is my birthday party.";
		 																													//Construct a new Appointment object with the initial data
		 																													appt = new Appt(startHour,
		 																																	 startMinute ,
		 																																	 startDay ,
		 																																	 startMonth ,
		 																																	 startYear ,
		 																																	 title,
		 																																	description);
		 																																	int[] recurDaysArr = {2,3,4};
		 																																	appt.setRecurrence(recurDaysArr, 1, 2, 2);
		 																																	listAppts.add(appt);

		 																																	GregorianCalendar today = new GregorianCalendar(2018,01,14);


		 TimeTable timeTable=new TimeTable();
		 GregorianCalendar someday = new GregorianCalendar(2018,05,14);
		 timeTable.getApptRange(listAppts,today, someday);
		 assertEquals(3, appt.getRecurDays().length);
		 assertEquals(16, appt.getStartHour());
		 assertEquals(30, appt.getStartMinute());
		 assertEquals(15, appt.getStartDay());
		 assertEquals(02, appt.getStartMonth());
		 assertEquals(2018, appt.getStartYear());
		 assertEquals("visit", appt.getTitle());
		 assertEquals("This is my birthday party.", appt.getDescription());

	 }
	 @Test
	 public void test04()  throws Throwable  {
		 LinkedList<Appt> listAppts = new LinkedList<Appt>();//for linked list of appointments
					//create first appt
					int startHour=15;
					int startMinute=30;
					int startDay=15; //this day is 14th
					int startMonth=01; //its January
					int startYear=2018; //its 2018
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
									listAppts.add(appt);


		 //create second appt1
									startHour=14;
									startMinute=30;
									startDay=14;
									startMonth=01;
									startYear=2018;
									title="Class";
									description="This is my birthday party.";
									//Construct a new Appointment object with the initial data
									appt = new Appt(startHour,
													 startMinute ,
													 startDay ,
													 startMonth ,
													 startYear ,
													 title,
													description);
													listAppts.add(appt);

													//create second appt1
																				startHour=13;
																				startMinute=30;
																				startDay=14;
																				startMonth=01;
																				startYear=2018;
																				title="meeting";
																				description="This is my birthday party.";
																				//Construct a new Appointment object with the initial data
																				appt = new Appt(startHour,
																								 startMinute ,
																								 startDay ,
																								 startMonth ,
																								 startYear ,
																								 title,
																								description);
																								listAppts.add(appt);
																								//create second appt1
																															startHour=16;
																															startMinute=30;
																															startDay=15;
																															startMonth=02;
																															startYear=2018;
																															title="visit";
																															description="This is my birthday party.";
																															//Construct a new Appointment object with the initial data
																															appt = new Appt(startHour,
																																			 startMinute ,
																																			 startDay ,
																																			 startMonth ,
																																			 startYear ,
																																			 title,
																																			description);
																																			int[] recurDaysArr = {2,3,4};
																																			appt.setRecurrence( recurDaysArr, 3, 3, 3);
																																			listAppts.add(appt);
																																			// listAppts.deleteAppt(listAppts, appt);

		GregorianCalendar today = new GregorianCalendar(2018,01,14);
		TimeTable timeTable = new TimeTable();
		 GregorianCalendar someday = new GregorianCalendar(2018,05,14);
		 timeTable.getApptRange(listAppts,today,someday);
		 // assertEquals()
		 assertEquals(16, appt.getStartHour());
		 assertEquals(30, appt.getStartMinute());
		 assertEquals(15, appt.getStartDay());
		 assertEquals(02, appt.getStartMonth());
		 assertEquals(2018, appt.getStartYear());
		 assertEquals("visit", appt.getTitle());
		 assertEquals("This is my birthday party.", appt.getDescription());

	 }
	 @Test
	 public void test05()  throws Throwable  {

		 TimeTable timetable = new TimeTable();
		 GregorianCalendar today = new GregorianCalendar(2018,01,01);
		 // TimeTable timeTable = new TimeTable();
		 GregorianCalendar someday = new GregorianCalendar(2018,02,01);
		 Appt appt = new Appt(1,1,1,1,2018, "Class", "this is my class");
		 CalDay cal = new CalDay(today);

		 cal.addAppt(appt);
		 assertEquals(1,timetable.getApptRange(cal.getAppts(), today, someday).get(0).getAppts().size());
		 timetable.deleteAppt(cal.getAppts(), appt);
		 assertNull(null,timetable.deleteAppt(cal.getAppts(), appt));

	 }

	 @Test
	 public void test06 ()  throws Throwable  {

		 TimeTable timetable = new TimeTable();
		 GregorianCalendar today = new GregorianCalendar(2018,01,01);
		 CalDay cal = new CalDay(today);

		 Appt appt1 = new Appt(2,1,1,1,2018, "Class", "this is my class");
		 cal.addAppt(appt1);

		 Appt appt2 = new Appt(3,1,1,1,2018, "Class", "this is my class");
		 cal.addAppt(appt2);

		 Appt appt3 = new Appt(4,1,1,1,2018, "Class", "this is my class");
		 cal.addAppt(appt3);

		 Appt appt4 = new Appt(5,1,1,1,2018, "Class", "this is my class");
		 cal.addAppt(appt4);

		 assertEquals(null, timetable.deleteAppt(cal.getAppts(), appt4));
		 assertEquals(3,timetable.deleteAppt(cal.getAppts(), appt3).size());
		 // assertEquals(null, timetable.deleteAppt(cal.getAppts(), appt2));

	 }

	 @Test
	 public void test07 ()  throws Throwable  {

		 TimeTable timetable = new TimeTable();
		 GregorianCalendar today = new GregorianCalendar(2018,01,01);
		 CalDay cal = new CalDay(today);

		 Appt appt1 = new Appt(2,1,1,1,2018, "Class", "this is my class");
		 cal.addAppt(appt1);

		 Appt appt2 = new Appt(3,1,1,1,2018, "Class", "this is my class");
		 cal.addAppt(appt2);

		 Appt appt3 = new Appt(4,1,1,1,2018, "Class", "this is my class");
		 cal.addAppt(appt3);

		 // cal.addAppt(appt4);
		 int[] pv = new int[]{1,2,0};
		 timetable.permute(cal.getAppts(), pv);
		 assertNotNull(timetable.permute(cal.getAppts(), pv));
	 }

	 @Test
	 public void test08 ()  throws Throwable  {

		 	 TimeTable timetable = new TimeTable();

		 GregorianCalendar today = new GregorianCalendar(2018,01,01);
		 CalDay cal = new CalDay(today);

		 		 Appt appt1 = new Appt(1,100,1,1,2018, "Class", "this is my class");
		 		 cal.addAppt(appt1);
				 assertNull(timetable.deleteAppt(cal.getAppts(), appt1));

	 }
// add more unit tests as you needed
}
