package com.practice;

import java.util.Calendar;
import java.util.TimeZone;

/*The Calendar class is an abstract clas
    Calendar provides aclass method, getInstance, for getting a generally usefulobject of this type.
     Calendar's getInstance method returns a Calendar object whose calendar fields 
     have been initialized with the current date and time: */
public class Ch15_Calender {

	public static void main(String[] args) {
		
		Calendar c=Calendar.getInstance();
		System.out.println(c.getTimeZone());
		System.out.println(c.getTimeZone().getID());//Asia/Calcutta
		System.out.println(c.getCalendarType());//Returns the calendar type of this Calendar
		                                                               //gregory
		System.out.println(c.get(Calendar.DATE));//18
		System.out.println(c.get(Calendar.SECOND));//2
		System.out.println(c.get(Calendar.HOUR));//2
		System.out.println(c.get(Calendar.HOUR_OF_DAY)+":"+c.get(Calendar.MINUTE)+":"+c.get(Calendar.SECOND));//14 
		                                                                                  //HOUR_OF_DAY is used for the 24-hour clock
		                                                                                   //14:16:41
		
		//GREGORIAN CALENDAR CLASS AND TIMEZONE
		System.out.println(TimeZone.getAvailableIDs()[0]);
		System.out.println(TimeZone.getAvailableIDs()[1]);
		System.out.println(TimeZone.getAvailableIDs()[2]);
		System.out.println(TimeZone.getAvailableIDs()[3]);
		System.out.println(TimeZone.getAvailableIDs()[4]);
		System.out.println(TimeZone.getAvailableIDs()[55]);
		System.out.println(TimeZone.getAvailableIDs()[56]);
		System.out.println(TimeZone.getAvailableIDs()[503]);//Indian/Maldives
	}

}
