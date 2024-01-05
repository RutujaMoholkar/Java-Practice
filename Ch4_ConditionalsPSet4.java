package com.practice;

import java.util.Scanner;

public class Ch4_ConditionalsPSet4 {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		
		//Problem 2
		
		/* System.out.println("Enter sub1 marks :");
		int sub1=sc.nextInt();
		System.out.println("Enter sub2 marks :");
		int sub2=sc.nextInt();
		System.out.println("Enter sub3 marks :");
		int sub3=sc.nextInt();
		float avg= (sub1+sub2+sub3)/3.0f;
		System.out.println("Student's percentage "+avg);
		if(avg>=40 && sub1>=33 && sub2>=33 && sub3>=33)
		{
			System.out.println("Congratulations you are passed");
		}
		else
		{
			System.out.println("You are fail. Better luck next time");
		}
		*/
		
		//Problem 3
		/*System.out.println("Enter your income in lakh :");
		float income=sc.nextFloat();
		float tax=0;
		if(income<=2.5f)
		{
			tax=tax+0;
		}
		else if(income>2.5f && income<=5.0f)
		{
			tax=tax+0.05f *(income-2.5f);
		}
		else if(income>5f && income<=10.0f)	
		{
			tax=tax+0.05f * (5.0f -2.5f);
		    tax=tax+0.2f *(income-5f);
		
		}
		else if(income>10.0f )	
		{
			tax=tax+0.05f * (5.0f -2.5f);
		    tax=tax+0.2f *(10.0f -5f);
		    tax=tax+0.3f*(income-10.0f);
		}
		System.out.println("Total tax :"+tax);
		*/
		
		//Problem 4
	    /*System.out.println("Enter Choice");
		int day=sc.nextInt();
		switch(day) {
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		case 7:
			System.out.println("Sunday");
			break;
		default:
			System.out.println("Enter valid case");
		}*/
		
		//Problem 6
		/*System.out.println("Enter the website");
		String website=sc.next();
		if(website.endsWith(".org"))
		{
			System.out.println("This is organizational website");
		}
		else if(website.endsWith(".com"))
		{
			System.out.println("This is commercial website");
		}
		else if(website.endsWith(".in"))
		{
			System.out.println("This is indian website");
		}
		*/
		
		//Problem 5 year is leap or not
		int year=1972;
		if(year%4==0)
		{
			if(year%100==0)
			{
				if(year%400==0)
				{
					System.out.println("Year is leap year");
				}
				else
				{
					System.out.println("Year is not leap year");
				}
			}
			else 
			{
				System.out.println("Year is leap year");
			}
		}
		else
		{
			System.out.println("Year is not leap year");
		}

	}

}
