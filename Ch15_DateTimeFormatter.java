package com.practice;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Ch15_DateTimeFormatter {

	public static void main(String[] args) {
		LocalDateTime dt=LocalDateTime.now();//this is the date
		System.out.println(dt);//2023-10-18T20:15:34.817505400
		
		DateTimeFormatter df=DateTimeFormatter.ofPattern("dd-MM-yyyy--H:m--a----E");//this is the format,E for day and a for am pm
		                                                                                                                 //18-10-2023--23:1--pm----Wed
		DateTimeFormatter df2=DateTimeFormatter.ISO_LOCAL_DATE;
		
		String mydate=dt.format(df);//creating date string using date and format
		System.out.println(mydate);//18-10-2023
		
		
		String mydate2=dt.format(df2);
		System.out.println(mydate2);//2023-10-18
	}

}
