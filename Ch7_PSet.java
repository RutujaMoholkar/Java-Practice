package com.practice;

import java.util.Scanner;

public class Ch7_PSet {
	/*public  static void multitable(int num)
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(num*i);
			System.out.format("%d X %d = %d\n",num,i,num*i)
			
		}
	}
	
	 public static void pattern1(int n)
	 {
		 for(int i=1;i<=n;i++)
		 {
			 for(int j=1;j<=i;j++)
			 {
				 System.out.print(" * ");
			 }
			 System.out.println();
		 }
	 }

	public static int sumOfNatural(int num)
	{
		int sum=0;
		for(int i=1;i<=num;i++)
		{
			sum += i;
		}
		return sum;
	}

	
	static int sumRec(int n)
	{
		if(n==1)
		{
			return 1;
		}
		else
		{
			return n+sumRec(n-1);
		}
	}
		
	
		static int fib(int n)
		{
			/*if(n==1)//1st term is zero
			{
				return 0;
			}
			else if(n==2) 
			{
				return 1;
			}
			
		OR
		
			if(n==1 || n==2)
			{
				return n-1;
			}
			else
			{
				return fib(n-1)+fib(n-2);
			}
		}
	
			static int avg(int ...arr)
			{
				int sum=0;
				for(int element : arr)
				{
					sum += element;
				}
				return (sum/arr.length);
			}
	
	    static void patternRec(int n)
	    {  
	    	if(n>0)
	    	{
	    	patternRec(n-1);
	    	
	    	for(int i=1;i<=5-n;i++)
	    	{
	    		System.out.print(" * ");
	    	}
	    	System.out.println();
	    	}
	    }
	   */	
	static float temp(float t)
	{
		float result = (t*9/5)+32;
		return result;
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		/*multitable(10);
		pattern1(5);
		System.out.println("Enter the limit :");
		int n=sc.nextInt();
		System.out.println("Sum of first "+n+" natural numbers is :"+sumOfNatural(n));
      
		
		int c=sumRec(3);
		System.out.println("sum :"+c);
		  
		
		//Problem 4
		//Fibonacci series = 0,1,1,2,3,5,8,13.....
		int result = fib(3);
		System.out.println("result :"+result);
	
		//Problem 5
		int result=avg(10,2,38,23,38,23,21);
		System.out.println("Average is :"+result);
	 
		//Problem 6
		patternRec(4);
		*/	
		
		//Problem 7
		float result=temp(8f);
		System.out.println("Coverting celcius to fahernheit :"+result);
	}

}
