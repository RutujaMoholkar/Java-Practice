package com.practice;

import java.util.Scanner;

public class Ch5_LoopsPset {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//Problem 1
		/*for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=5-i;j++)
			{
				System.out.print(" * ");
			}
			System.out.println();
		}
		
		
		//Problem 2
		System.out.println("Enter the limit :");
		int n=sc.nextInt();
		int sum=0;
		int i=0;
		while(i<n)
		{
			if(i%2==0)
			{
				sum=sum+i; // sum=sum+(2*i)
			}
			i++;
		}
		System.out.println("Sum of first even "+n+" natural number is :"+sum);
		
		
		 //Problem 3
		System.out.println("Enter the number :");
		int n=sc.nextInt();
		for(int i=1;i<=10;i++)
		{
			System.out.println(n*i);
			 Systrm.out.printf(" %d X %d = %d \n",n,i,n*i);
		}
		
		
		//Problem 4
		System.out.println("Enter the number :");
		int n=sc.nextInt();
		for(int i=10;i>=1;i--)
		{
			System.out.println(n*i);
		}
		
		
		//Problem 5
		int fact=1;
		System.out.println("Enter the number :");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;// fact *= i
		}
		System.out.println("Factorial of a number "+n+" is "+fact);
		*/
		
		//Problem  9
		int n=8;
		int i=1,sum=0;
		while(i<=10)
		{
			System.out.println(n +" X "+i +" = "+n*i);
			sum=sum+(n*i); //sum += n*i
			i++;
			
		}
		System.out.println("sum "+sum);

	}

}
