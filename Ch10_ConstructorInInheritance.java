package com.practice;


/* When there are multiple constructors in the parent class the constructor without any parameter is called from
    child class.If we want to call constructor with parameter from parent class,we can use SUPER KEYWORD.
    super(a,b); calls constructor from parent class which takes 2 parameters
    
 */

class Base
{
	Base()
	{
		System.out.println("I am constructor in base class");
	}
	Base(int x)
	{
		System.out.println("I am constructor in base class with value of x :"+x);
	}
}
class Derived extends Base
{
	Derived()
	{
		System.out.println("I am derived class constructor");
	}
	Derived(int x,int y)
	{
		super(x);
		System.out.println("I am derived class constructor with value of y: "+y);
	}
}
class DerivedChild extends Derived
{
	DerivedChild()
	{
		System.out.println("I am child of derived class");
	}
	DerivedChild(int x,int y,int z)
	{
		super(x,y);
		System.out.println("I am child of derived class with z value: "+z);
	}
}
public class Ch10_ConstructorInInheritance 
{
	public static void main(String[] args)
	{
		//Base b1=new Base();
		//Derived d1=new Derived();
		DerivedChild e1=new DerivedChild();
		DerivedChild e2=new DerivedChild(23,76,90);
		
	}

}
