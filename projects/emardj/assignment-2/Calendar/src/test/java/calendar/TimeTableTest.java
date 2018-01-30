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
																																	GregorianCalendar tomorrow = new GregorianCalendar(2018, 01,25);;
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

																																			GregorianCalendar today = new GregorianCalendar(2018,01,14);


		TimeTable timeTable=new TimeTable();

		 GregorianCalendar someday = new GregorianCalendar(2018,05,14);
		 timeTable.getApptRange(listAppts,today, someday);
		 assertEquals(16, appt.getStartHour());
		 assertEquals(30, appt.getStartMinute());
		 assertEquals(15, appt.getStartDay());
		 assertEquals(02, appt.getStartMonth());
		 assertEquals(2018, appt.getStartYear());
		 assertEquals("visit", appt.getTitle());
		 assertEquals("This is my birthday party.", appt.getDescription());

	 }
//add more unit tests as you needed
}
