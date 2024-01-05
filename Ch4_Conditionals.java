package com.practice;

import java.util.Scanner;

public class Ch4_Conditionals {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter choice :");
	   int var=sc.nextInt();
		
		switch(var)
		{
		case 1:
			System.out.println("Perform addition");
			break;
		case 2:
			System.out.println("Perform substraction");
			break;
		case 3:
			System.out.println("Perform Multiplication");
			break;
		default:
			System.out.println("Chill you are bright in maths");
			
		}
		
		
		
		
		/*int age;
		System.out.println("Enter the age :");
		age=sc.nextInt();
		if(age<18)
		{
			System.out.println("You are little");
		}
		else if(age==18)
		{
			System.out.println("You are adult");
		}
		else
		{
			System.out.println("You are experienced");
		}*/

	}

}
