package com.practice;

import java.util.ArrayList;

public class Ch15_ArrayList {

	public static void main(String[] args)
	{
		ArrayList<Integer> l1=new ArrayList<>();
		ArrayList<Integer> l2=new ArrayList<>();
		
		l2.add(81);
		l2.add(82);
		l2.add(83);
		l2.add(84);
		l2.add(85);
		
		
		l1.add(6);
		l1.add(89);
		l1.add(6);
		l1.add(50);
		l1.add(0,78);
		System.out.println(l1);
		
		l1.addAll(l2);
		//l1.clear();
		l1.set(0, 566);//Replaces the element at the specified position in this list withthe specified element
		
		l1.retainAll(l2);//except l2 everything deleted
		for(int i=0;i<l1.size();i++) 
			//Returns the number of elements in this list.
		{
		System.out.print(l1.get(i)); //78, 6, 89, 6, 50, 81, 82, 83, 84, 85, 
		                                           //Returns the element at the specified position in this list
		System.out.print(", ");
		}
		System.out.println();
		System.out.println(l1.contains(7));//true
		System.out.println(l1.indexOf(81));
		System.out.println(l1.indexOf(801));//Returns the index of the first occurrence of the specified element in this list, 
		                                                       //or -1 if this list does not contain the element
		System.out.println(l1.lastIndexOf(6));
		System.out.println(l1.remove(1));
		System.out.println(l1.subList(1,4));//list between the specified fromIndex, inclusive, and toIndex, exclusive
	
	}
	

}
