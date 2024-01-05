package com.practice;

import java.util.Scanner;

class NegativeRadiusException1 extends Exception{
	public String getMessage() {
		return "Radius should positive";
	}
	public String toString() {
		return "Radius shouldn't be negative";
	}
}

public class Ch14_PracticeThrowThrows {
	public static double perimeter(int r) throws NegativeRadiusException1{
		if(r<0) {
			throw new NegativeRadiusException1();
		}
		else {
			double peri=2*Math.PI*r;
			return peri;
		}
	}
	
	public static int divide(int a,int b) throws ArithmeticException {
		int c=a/b;
		return c;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try
		{
			int div=divide(6,0);
			System.out.println(div);
			System.out.println("Enter the radius :");
			int r=sc.nextInt();
			double peri=perimeter(r);
			System.out.println(peri);
		}
		catch(NegativeRadiusException1 e)
		{
			System.out.println(e.toString());
			System.out.println(e.getMessage());
		}
		catch(Exception e)
		{
			System.out.println("Arithmetic Exception Reason: "+e);
		}
	 
	}

}
