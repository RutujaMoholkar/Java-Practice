package com.practice;

import java.util.Date;

//java.time ---->pacakge java8 onwards
//java.util--->before java8
//date in java is stored in long data type(no. of milliseconds passed from 1jan,1970)

public class Ch15_DateTime {

	public static void main(String[] args) {
		System.out.println(System.currentTimeMillis());//Returns the current time in milliseconds 1697553253998
	//1second=1000milliseconds
		System.out.println(System.currentTimeMillis()/1000);//sec  1697553339
		System.out.println(System.currentTimeMillis()/1000/3600);//hour 471542
		System.out.println(System.currentTimeMillis()/1000/3600/24);//day 19647
		System.out.println(System.currentTimeMillis()/1000/3600/24/365);//year 53
		
		
		
		//DATE CLASS---month starts from 0
		
		Date d=new Date();
		System.out.println(d);//gives current date and time  Tue Oct 17 23:27:38 IST 2023
		
		Date d1=new Date(1,2,10);//Sun Mar 10 00:00:00 IST 1901
		System.out.println(d1);
		
		Date d2=new Date(101,3,9,12,55,0);//Mon Apr 09 12:55:00 IST 2001
		System.out.println(d2);
		
	    System.out.println(d.getTime());//Returns the number of milliseconds since January 1, 1970, 00:00:00 GMT 
		
	    
	    //DATE CLASS
	    
	    System.out.println(d.getDate());//17
	    System.out.println(d.getSeconds());//50
	    System.out.println(d.getYear());//123
	    System.out.println(d.getHours());//23
	}
}