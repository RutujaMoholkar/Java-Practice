package com.practice;

import java.util.Scanner;

public class CGPA {

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		float sub1=45;
		float sub2=95;
		float sub3=48;
		float cgpa=(sub1+sub2+sub3)/30;
		System.out.println(cgpa);
		
	    //System.out.println("Enter input:");
		//System.out.println(sc.hasNextInt());
		
		System.out.println("Enter the kilometers :");
		double kilometer=sc.nextDouble();
		double miles;
		miles= kilometer * 0.621371 ;
		System.out.println("Miles :"+miles);

	}

}
