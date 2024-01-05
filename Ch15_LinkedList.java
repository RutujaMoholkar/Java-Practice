package com.practice;

import java.util.LinkedList;

//All methods of ArrayList will be executed by creating reference of linkedlist
public class Ch15_LinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<Integer> l1=new LinkedList<> ();
		l1.add(6);
		l1.add(89);
		l1.add(6);
		l1.add(50);
		l1.add(0,78);
		
		l1.addFirst(90);
		l1.addLast(23); //Appends the specified element to the end of this list. 
	    System.out.println("getting last element :"+	l1.getLast());//Returns the last element in this list.
	    System.out.println( "removing last element: "+l1.removeLast());//Removes and returns the last element from this list.
		
	    System.out.println(l1);
		l1.set(0, 566);
		System.out.println(l1.lastIndexOf(6));
		System.out.println(l1.remove(1));
		System.out.println(l1.subList(1,4));
		

	}

}
