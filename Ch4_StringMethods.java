package com.practice;


/*
  1. length()
  2. toUpperCase()
  3. toLowerCase()
  4. trim()
  5. subString(int start)
  6. subString(int start,int end) -------------->started from start index but end at (end-1)
  7. replace(char,char)
  8. startsWith(string)
  9. endsWith(string)
 10. charAt(int)
 11. indexOf(string) ----------------->returns 1st index of the string -----> returns -1 if it doesnt get any match
 12. indexOf(string,int index) ------------->starting from index
 13. lastIndexOf(string)
 14. lastIndexOf(string,int index)
 15. equals() -------------->returns boolean
 16. equalsIgnoreCase()----->return true if both strings are equal irrespective of cases
  
  
  Escape Sequence Character------------>seq of characters after back slash ( \ )
 */
import java.util.Scanner;

public class Ch4_StringMethods {

	public static void main(String[] args)
	{
		String str="Rutuja";
		String str2= new String("Ritesh");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string: ");
		String str3 = sc.next();
		int length=str2.length();
		System.out.println("Length of Sting is: "+length);
		System.out.println("Lowercase string : " +str.toLowerCase());
		System.out.println("Uppercase string : " +str.toUpperCase()); 
		String str4="     Sakshi          ";
		System.out.println(str4);
		System.out.println(str4.trim());
		String str5=str.substring(2);
		System.out.println("substring with begin index :"+str5);
		String str6=str.substring(1,4);
		System.out.println("substring with begin and end index :"+str6);
		String str7=str.replace('u', '&');
		System.out.println("u character in string is replaced with &:  " +str7);
		String str8=str.replace("u", "9090");
		System.out.println("u character in string is replaced with &:  " +str8);
		System.out.println(str.startsWith("Rutu"));
		System.out.println(str.startsWith("xz"));
		System.out.println(str.charAt(0));
		System.out.println(str.indexOf("i",4));
		System.out.println(str.lastIndexOf("u",1));
		System.out.println(str.equals("Rutuja"));
		System.out.println(str.equalsIgnoreCase("rAtuja"));
		
		System.out.println("she said,\"hello !\" to me");
		System.out.println("Hii how are you \r what is your name?");
	}

}
