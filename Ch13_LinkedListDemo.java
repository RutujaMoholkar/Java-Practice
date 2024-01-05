package com.practice;

import java.util.LinkedList;

/*LinkedList ---------->duplicates allowed
                                    insertion order preserved
                                    ds--->LinkedList
                                    Heterogeneous insertion possible
                                    null insertion possible
 
 Constructors---------->LinkedList l=new LinkedList();
                                     LikedList l1=new LinkedList(Collection c);
                                     
 frequent operation-----> Insertion or deletion in between
 
 methods------------> boolean addFirst(Object o);
                                   boolean addLast(Object o);
                                   Object getFirst();
                                   Object getLast();
                                   Object removeFirst();
                                   Object removeLast();
 */
public class Ch13_LinkedListDemo {

	public static void main(String[] args) {
		LinkedList bag=new LinkedList();
		bag.add("fruits");
		bag.add("vegetables");
		bag.add("flowers");
		bag.add("books");
				
		bag.addFirst("carrot");
		bag.addLast("coke");
		System.out.println(bag);                           //[carrot, fruits, vegetables, flowers, books, coke]
		System.out.println(bag.getFirst());
		System.out.println(bag.getLast());            //Returns the last element in this list.
		System.out.println(bag.removeFirst());
		System.out.println(bag.removeLast());
		System.out.println(bag);                           //[fruits, vegetables, flowers, books]
		
		
		
	}

}
