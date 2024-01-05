package com.practice;

import java.util.Scanner;

//handel the specific exception and continue with already exists try block
public class Ch14_NestedTryCatch {
 
	public static void main(String[] args) {
		int [] marks=new int[4];
		marks[0]=90;
		marks[1]=67;
		marks[2]=22;
		marks[3]=178;
		Scanner sc=new Scanner(System.in);  
		boolean flag=true;
		while(flag) {
		System.out.println("Enter the index :");
		int index=sc.nextInt();
		try 
		{
			System.out.println("Welcome to chapter 13 :");
			try {
				System.out.println(marks[index]);
				flag=false;
			}
			catch(ArrayIndexOutOfBoundsException e)	{
				System.out.println(e);
				System.out.println("Exception in level two");
			}
//go to outside catch block when we not handel it in inside			
		}
		catch(Exception e)	{
			System.out.println("Exception in level one ");
		}
		
		}
		
	}
}
