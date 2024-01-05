package com.practice;

import java.util.ArrayList;

/*
 ArrayList ---------->duplicates are allowed
                                  insertion order preserved
                                  Heterogeneous insertion is possible
                                  null insertion possible
                                  ds --- dynamic/growable array
                                  
 Constructors-------->ArrayList() default capacity=10
                                  ArrayList(int capacity)
                                  ArrayList(Collection c)
                                  
  frequent operation----->retrieval                           
*/
public class Ch15_ArrayListDemo {

	public static void main(String[] args) {
		ArrayList books=new ArrayList();
		books.add("java");//appends element to end of the list
		books.add(1,"Python");//Inserts the specified element at the specified position in list
		books.add(100);
		books.add(null);
		books.add("java");
		//System.out.println(books);  //[java, Python, 100, null, java]
		
		ArrayList bag=new ArrayList();
		bag.add("banana");
		bag.add("apple");
		bag.add("dragon fruit");
		//System.out.println(bag);  //[banana, apple, dragon fruit]
		
		bag.addAll(books);
		//System.out.println(bag); //[banana, apple, dragon fruit, java, Python, 100, null, java]
		
		bag.remove(2); //Removes the element at the specified position in this list
		bag.remove("Python");
		//System.out.println(bag); //[banana, apple, java, 100, null, java]
		
		//System.out.println(bag.indexOf(100)); //3
		//System.out.println(bag.lastIndexOf("java")); //5
		
		bag.set(1, 3.14);
		//System.out.println(bag); //[banana, 3.14, java, 100, null, java]
		
		//System.out.println(bag.contains(3.14)); //true
		//System.out.println(bag.containsAll(books)); //false does my bag contains collection of books
		
		//System.out.println(bag.size()); //6
		
		Object[] a=bag.toArray(); //Returns an array containing all of the elements in this list in proper sequence 
		for(Object element:a) {
			System.out.println(element); //banana
			                                              // 3.14
			                                               // java
			                                               //100
			                                               //null
			                                               //java
		}		

	}

}
