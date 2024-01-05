package com.practice;

public class Ch7_Recursion {
	
	public static int fact(int num)
	{
		if(num==0 || num==1)
		{
			return 1;
		}
		else
		{
			return num*fact(num-1);
		}
	}
	
	public static int iterative_factorial(int n)
	{
		if(n==0 || n==1)
		{
			return 1;
		}
		else
		{
			int product=1;
			for(int i=1;i<=n;i++)
			{
				product *= i;
			}
			return product;
		}
	}

	public static void main(String[] args) 
	{
		System.out.println("Factorial of 4 is: "+fact(4));
		System.out.println("Factorial of 5 is: "+iterative_factorial(5));
	}

}
