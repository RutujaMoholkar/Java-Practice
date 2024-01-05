package com.practice;

public class Ch7_Methods 
{
	/*static int logic(int a,int b)
	{
		int z;
		if(a>b)
		{
			z=a+b;
		}
		else
		{
			z=(a+b)*5;
		}
		return z;
	}
	
	static void change(int a)
	{
		a=98;
	}
	
	static void change2(int[] arr)
	{
		arr[0]=90;
	}
*/
	static int sum(int x,int ...arr)
	{
		// Avaliable as --- int [] arr;
		int result=x;
		for(int a : arr)
		{
			result +=a;
		}
		return result;
	}
	public static void main(String[] args) 
	{
		/*int a=5;
		int b=6;
		int c,c1;
		c=logic(a,b);
		c1=logic(3,1);
		System.out.println(c);
		System.out.println(c1);
	
		int x=45;
		change(x);
		System.out.println("The value of x after running change() is "+x);
		
		
		int [] marks= {43,89,67,35,60,55};
		change2(marks);
        System.out.println(marks[0]);
        */
		
		System.out.println("The sum of 4 & 6 is :"+sum(4,6));
		System.out.println("The sum of 4,9 & 6 is :"+sum(4,9,6));
	//	System.out.println("The sum of nothing is :"+sum()); at least one argument should be there 
		System.out.println("The sum of 1 is :"+sum(1));
		
	}

}
