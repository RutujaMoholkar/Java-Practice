package com.practice;

import java.util.Scanner;

public class Ch14_SpecificExceptionCatch {

	public static void main(String[] args) {
		int [] marks=new int[4];
		marks[0]=90;
		marks[1]=67;
		marks[2]=22;
		marks[3]=178;
		Scanner sc=new Scanner(System.in);
	
		System.out.println("Enter the number :");
		int number=sc.nextInt();
		System.out.println("Enter the index :");
		int index=sc.nextInt();
	try {
		
		System.out.println("Element at index :"+index+" is "+marks[index]);	
		System.out.println("Divide element at array with number :"+marks[index]/number);
	}
	catch(ArithmeticException e) {
		System.out.println("We can't divide element by zero reason: "+e);
	}
	catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("Array index is out of bound exception reason :"+e);
	}
	catch(Exception e) {
		System.out.println(e);
	}
	System.out.println("End of the program");
	}

}
