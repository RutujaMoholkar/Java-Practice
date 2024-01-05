package com.practice;


class A
{
	public int harry()
	{
		return 4;
	}
	public void method2()
	{
		System.out.println("I am method2 of parent class A");
	}
}

class B extends A
{  
	@Override
	public void method2()
	{
		System.out.println("I am method2 of child class B");
	}
}

public class Ch10_MethodOveriding {

	public static void main(String[] args) 
	{
		A obj=new A();
		obj.method2();
		
		B obj2=new B();
		obj2.method2();
	
	}

}
