package com.practice;

import java.util.HashSet;

//duplication is not allowed
//insertion order is not preserved

public class Ch15_HashSet {

	public static void main(String[] args) {
		HashSet<Integer> h1=new HashSet<>();
		h1.add(12);
		h1.add(77);
		h1.add(33);
		h1.add(60);
		h1.add(12);
		System.out.println(h1);
		
		System.out.println(h1.contains(77));//true
		System.out.println(h1.size());//4
		System.out.println(h1.isEmpty());//false
		
	}

}
