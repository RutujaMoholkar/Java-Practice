package com.practice;

import java.util.ArrayDeque;

public class Ch15_ArrayDeque {

	public static void main(String[] args) {
		ArrayDeque<Integer> d1=new ArrayDeque<>();
		d1.add(89);//Inserts the specified element at the end of this deque. 
		                  //This method is equivalent to addLast.

		d1.add(77);
		d1.add(23);
		d1.addLast(44);
		 d1.addFirst(6);
		System.out.println(d1);//[6, 89, 77, 23, 44]
	 
	    
	    d1.pop();//removes and returns the first element of this deque. 
		System.out.println(d1);//[89, 77, 23, 44]
		
		d1.push(33);//[33, 89, 77, 23, 44]  inserts the element at the front of this deque. 
		System.out.println(d1);
		
		System.out.println(d1.contains(2));//false
		System.out.println(d1.size());
		
		System.out.println(d1.getFirst());//33
		                        //Retrieves, but does not remove, the first element of this deque.
		                      //This method differs from peekFirst only in that it throws an exception if this deque is empty.
		                      //NoSuchElementException - if this deque is empty
		
		System.out.println(d1.getLast());
		
		System.out.println(d1.remove());//Retrieves and removes the head of the queue represented by this deque
		
		d1.offer(12);  // Inserts the specified element at the end of this deque. This method is equivalent to offerLast.
        
		System.out.println(d1.poll());//Retrieves and removes the head of the queue represented by this deque
	
	
	
	}

}
