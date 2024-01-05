package com.practice;

public class Ch15_PritimitiveTypeTWrapperObject {

	public static void main(String[] args) {
		byte b=15;
		short c=20;
		int i=79;
		long l=67;
		float f=3.14f;
		double d=67.89d;
		char ch='d';
		boolean b1=false;
		
		//Auto-boxing
		Byte byteobj=b;
		Short shortobj=c;
		Integer intobj=i;
		Long longobj=l;
		Float floatobj=f;
		Double doubleobj=d;
		Character charobj=ch;
		Boolean boolobj=b1;
		
		//Printing objects
		System.out.println("Byte object: "+byteobj);
		System.out.println("short object: "+shortobj);
		System.out.println("integer object: "+intobj);
		System.out.println("long object: "+longobj);
		System.out.println("float object: "+floatobj);
		System.out.println("double object: "+doubleobj);
		System.out.println("character object: "+charobj);
		System.out.println("boolean object: "+boolobj);
		
		
		

	
	
	}

}
