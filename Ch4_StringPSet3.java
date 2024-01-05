package com.practice;

public class Ch4_StringPSet3 {

	public static void main(String[] args) 
	{
		//Problem 1
		String name="jack PARAKR";
		name=name.toLowerCase();
		System.out.println(name);
		
		//Problem 2
		String text=" To lower case";
		text=text.replace(" ", "_");
		System.out.println(text);
		
		//Problem 3
		String letter="Dear <|name|> ,Thanks a lot!";
		letter=letter.replace("<|name|>", "Suraj");
		System.out.println(letter);
		
		//Problem 4
		//If returns -1 means it doesnt contain any double or triple spaces.
		String text1="this string  containd double or   triple spaces";
		System.out.println(text1.indexOf("   "));
		System.out.println(text1.indexOf("  "));
		
		//Problem 5
		String text2="Dear Harry,\n\tYou are providing valuable content. \nThanks a lot.";
		System.out.println(text2);
		
	}

}
