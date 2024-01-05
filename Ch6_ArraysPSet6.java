package com.practice;
import java.util.Scanner;

public class Ch6_ArraysPSet6 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		/*
		//Problem 1
		float sum=0;
		float[] arr =new float[5];
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter an element: ");
			arr[i]=sc.nextFloat();
			sum += arr[i];
		}
		System.out.println("Sum of elements of array :"+sum);
		
		
		
		//Problem 2
		float[] arr =new float[5];
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter an element: ");
			arr[i]=sc.nextFloat();
		}
		System.out.println("Enter the element to search: ");
		float num=sc.nextFloat();
		boolean isArray= false;
		for(float element : arr)
		{
			if(num==element)
			{
				isArray= true;
				break;
			}
		}
		if(isArray)
		{
			System.out.println("Element is present in the array");
		}
		else
		{
			System.out.println("Element is not present in the array");
		}
		
		
		//Problem 3
		int[] marks= {56,89,20,82,47,83};
		int sum=0;
		for(int element : marks)
		{
			sum += element;
		}
		System.out.println("Average of physics marks is :"+sum/marks.length);
		
		
		//Problem 4
		int [][] mat1 =new int [2][2];
		int [][] mat2 =new int [2][2];
		int [][] result= new int[2][2];
		System.out.println("Entering elements for mat1 :");
		for(int i=0;i<mat1.length;i++)
		{
			for(int j=0;j<mat1[i].length;j++)
			{
				System.out.println("Enter an elemnt :");
				mat1[i][j]=sc.nextInt();
			}
		}
		System.out.println("Entering elements for mat2 :");
		for(int i=0;i<mat2.length;i++)//row number of times
		{
			for(int j=0;j<mat2[i].length;j++)//column number of times
			{
				System.out.println("Enter an elemnt :");
				mat2[i][j]=sc.nextInt();
			}
		}
		System.out.println("Sum of elements of 2 X 3 matrix is :");
		for(int i=0;i<mat1.length;i++)
		{
			for(int j=0;j<mat1[i].length;j++)
			{
				result[i][j]=mat1[i][j]+mat2[i][j];
				System.out.print(result[i][j]+" ");
			}
			System.out.println();
		}
		
		
		//Problem 5
		
		int [] marks =new int[5];
		System.out.println("Entering elements to array :");
		for(int i=0;i<marks.length;i++)
		{
			marks[i]=sc.nextInt();
		}
		System.out.println("Array in reverse order :");
		for(int i=marks.length-1;i>=0;i--)
		{
			System.out.println(marks[i]);
		}
		
		
		int [] arr= {1,2,5,7,8,90,23};
		int l =arr.length;
		int n=Math.floorDiv(l,2);
		int temp;
		for(int i=0;i<n;i++)
		{
			//swap arr[i] to arr[l-1-i]
			temp=arr[i];
			arr[i]=arr[l-1-i];
			arr[l-1-i]=temp;
						
		}
		for(int elements : arr)
		{
			System.out.println(elements);
		}
		
		
		//Problem 6
		 * Gives minimum and maximum range of integer
		 Sysout(Integer.MIN_VALUE);
		 Sysout(Integer.MAX_VALUE);
		  
		int [] arr= {1,2,5,7,8,90,23};
		int max=Integer.MIN_VALUE;//0
		for(int element: arr)
		{
			if(element>max)
			{
				max=element;
			}
		}
		System.out.println("Maximum element in array is :"+ max);
		*/
		
		//Problem 7
		int [] arr= {1,2,-98,7,8,9,-1};
		int min=Integer.MAX_VALUE;
		for(int element: arr)
		{
			if(element<min)
			{
				min=element;
			}
		}
		System.out.println("Minimum element in array is :"+ min);
		
		/*
		//Problem 8
		int [] arr= {1,2,5,7,8,9,0};
		boolean isSorted=true;
		for(int i=0;i<arr.length-1;i++) 
		{
			if(arr[i]>arr[i+1])
			{
				isSorted=false;
				break;
			}
		}
		if(isSorted)
		{
			System.out.println("Array is sorted");
		}
		else
		{
			System.out.println("Array is not sorted");
		}
		*/
	}
	
}
