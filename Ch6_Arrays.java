package com.practice;

public class Ch6_Arrays {

	public static void main(String[] args)
	{
		/*There are 3 main ways to write an array 
		  1.int [] marks = new int[size];  declaration+memory allocation
		  2.int [] marks;  declaration
		     marks=new int[size]; memory allocation
		  3.int [] marks={23,78,90,45}; it will automatically calculate the size
		
		*/
		int[] marks = new int[5];
		marks[0] =67;
		marks[1] =97;
		marks[2] =45;
		marks[3] =22;
		marks[4] =07;
		for(int i=0;i<marks.length;i++)
		{
			System.out.println(marks[i]);
		}
		System.out.println("Printing array in reverse order :");
		for(int i=marks.length-1;i>=0;i--)
		{
			System.out.println(marks[i]);
		}
		System.out.println("Displaying array elements using for-each loop");
		for(int element:marks)
		{
			System.out.println(element);
		}
	}

}
