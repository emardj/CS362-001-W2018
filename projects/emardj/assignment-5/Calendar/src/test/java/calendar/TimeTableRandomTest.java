//Jillian Emard
//ID:932510205

package calendar;

import java.util.Calendar;
import java.util.Random;
import java.util.GregorianCalendar;
import org.junit.Test;
import java.util.*;


import static org.junit.Assert.*;



/**
 * Random Test Generator  for TimeTable class.
 */

public class TimeTableRandomTest {
	private static final long TestTimeout = 60 * 500 * 1; /* Timeout at 30 seconds */
	private static final int NUM_TESTS=100;


    /**
     * Generate Random Tests that tests TimeTable Class.
     */
	 @Test
	  public void radnomtest()  throws Throwable  {
			long startTime = Calendar.getInstance().getTimeInMillis();
			long elapsed = Calendar.getInstance().getTimeInMillis() - startTime;

			// System.out.println("Start testing...");

		 try{

			 for (int iteration = 0; elapsed < TestTimeout; iteration++) {

				 LinkedList<Appt> appts = new LinkedList<Appt>();

				 for (int i = 0; i < NUM_TESTS; i++) {
				 long randomseed =System.currentTimeMillis(); //10
	 //			System.out.println(" Seed:"+randomseed );
				 Random random = new Random(randomseed);
				 TimeTable timeTable = new TimeTable();

				 int startHour=ValuesGenerator.RandInt(random);
				 int startMinute=ValuesGenerator.RandInt(random);
				 int startDay=ValuesGenerator.RandInt(random);
				 int startMonth=ValuesGenerator.getRandomIntBetween(random, 1, 11);
				 int startYear=ValuesGenerator.RandInt(random);
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

					if(appts.size() == 0){
						timeTable.deleteAppt(appts,null);
						timeTable.deleteAppt(null,null);
						timeTable.deleteAppt(null,appt);
					}

			 appts.add(appt);
			 // System.out.println("appts size" + appts.size());
			 if(appts.size() > 3){
				 // System.out.println("Before Delete" + appts.size());

				 timeTable.deleteAppt(appts,appts.get(ValuesGenerator.getRandomIntBetween(random,1,(appts.size() - 1))));
				 // System.out.println("After Delete" + appts.size());
			 }
		 }

			 //Testing range

				 LinkedList<Appt> apptsforrange = new LinkedList<Appt>();
				 GregorianCalendar today = new GregorianCalendar(2012,1,1);
				 GregorianCalendar someday = new GregorianCalendar(2014,11,30);

				 for (int i = 0; i < NUM_TESTS; i++) {
				 long randomseed =System.currentTimeMillis(); //10
	 //			System.out.println(" Seed:"+randomseed );
				 Random random = new Random(randomseed);
				 TimeTable timeTable = new TimeTable();

				 int startHour=ValuesGenerator.getRandomIntBetween(random, 1,5);
				 int startMinute=ValuesGenerator.getRandomIntBetween(random, 30,50);
				 int startDay=ValuesGenerator.getRandomIntBetween(random, 1,65);
				 int startMonth=ValuesGenerator.getRandomIntBetween(random, 1, 11);
				 int startYear=ValuesGenerator.getRandomIntBetween(random, 2012,2014);
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

			 apptsforrange.add(appt);
			 if(apptsforrange.size() > 3){
				 timeTable.getApptRange(apptsforrange,today,someday);
			 }
		 }
				 elapsed = (Calendar.getInstance().getTimeInMillis() - startTime);
							// if((iteration%10000)==0 && iteration!=0 )
										// System.out.println("elapsed time: "+ elapsed + " of "+TestTimeout);
			 }

		 }catch(NullPointerException e){

 		}



	 }



}
