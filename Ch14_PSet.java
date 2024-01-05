package com.practice;

import java.util.Scanner;
class MaxEntriesException extends Exception{
	public String getMessage() {
		return "max entires is only up to 5";
	}
}



public class Ch14_PSet {
	
	static Scanner sc1=new Scanner(System.in);	
	
	
	public static void meth1() throws MaxEntriesException{
		int[] marks=new int[5];
		marks[0]=90;
		marks[1]=78;
		marks[2]=23;
		marks[3]=12;
		marks[4]=55;
		boolean flag=true;
		int i=0;
		
		while(flag)
		{ 
			System.out.println("Enter the index :");
			int index=sc1.nextInt();
				try {
					System.out.println("Value at index  "+index+" is "+marks[index]);
					break;
				}
				catch(Exception e) {
					System.out.println("Invalid index");
					i++;
					if(i>=5) {
						throw new MaxEntriesException();
						}
					
				}
				
			}
			
		
		}
		
	

	public static void main(String[] args) {

//Problem-1
	//	int a=7                           syntax error
	// int age=78;
	//	int year_born=2000-78  logical error
	// Sysout(6/0);                  runtime error
		
//Problem-2
		try {
			//int a=66/0;
		}
		catch(IllegalArgumentException e)
		//to indicate that a method has been passed an illegal or inappropriate argument 
		{
			System.out.println("hehe");
		}
		catch(ArithmeticException e) {
			System.out.println("haha");
		}
//Problem-3
		try {
			meth1();
		} catch (MaxEntriesException e) {
			System.out.println(e.getMessage());
		}

		

	}

}
