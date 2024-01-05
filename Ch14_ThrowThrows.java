package com.practice;

import java.util.Scanner;

class NegativeRadiusException extends Exception{
	public String getString() {
		return "Negative radius isn't allowed";
	}
	public String getMessage() {
		return "Radius should be positive..It shouldn't be negative";
	}
}
public class Ch14_ThrowThrows {

	static public double area(int r) throws NegativeRadiusException{
		if(r<0)
		{	
			throw new NegativeRadiusException();
		}
		return Math.PI*2*r;
	}
	
	//Made by harry
 static public int divide(int a,int b) throws ArithmeticException{
	int c=a/b;
	return c;
	
}
	public static void main(String[] args) {
		//used by shivam
		try
		{
		//	int c=divide(6,0);
			//System.out.println(c);
		}
		catch(Exception e)
		{
			System.out.println("Exception");
		}
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the radius: ");
		int r=sc.nextInt();
		double ar;
		
		try {
			ar = area(r);
			System.out.println("Circuference of circle :"+ar);
		} 
		catch (NegativeRadiusException e) {
			System.out.println(e.getMessage());		
			}
		
		}
	}
		
		
	



