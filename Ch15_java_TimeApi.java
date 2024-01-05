package com.practice;

//LocalTime is an immutable date-time object that represents a time,often viewed as hour-minute-second.
//Time is represented to nanosecond precision.
import java.time.*;

public class Ch15_java_TimeApi {

	public static void main(String[] args) {
	LocalDate d=LocalDate.now();
	System.out.println(d);//2023-10-18
	
	LocalTime t=LocalTime.now();//16:17:10.970774600
	System.out.println(t);
    
	LocalDateTime dt=LocalDateTime.now();
	System.out.println(dt);//2023-10-18T19:47:12.494335400 nanosec=10^-9 sec accuracy..sec
	
	
	}
}
