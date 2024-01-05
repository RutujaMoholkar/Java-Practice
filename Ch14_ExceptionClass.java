package com.practice;

import java.util.Scanner;

class MyException extends Exception{
	@Override
	public String toString() {
		return "I am toSting()";		
	}
	public String getMessage() {
		return " I am getMessage()";		
	}
	
}

class Ch14_ExceptionClass {

	public static void main(String[] args) {
		int a;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the input: ");
		a=sc.nextInt();
		if(a<90)		
		try {
			throw new MyException();			
		}
		catch(Exception e) {
			System.out.println(e);//toString
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}

}
