package com.practice;

/*
area(circle)=(pie)r*r;
area(cylinder)=2(pie)r*h+2(pie)r*r
volume(cylinder)=(pie)r*r*h

 */

class Circle1
{  
	public int radius;
	Circle1(int radius)
	{
		this.radius=radius;
	}
	public double area()
	{
		return Math.PI*radius*radius;
	}
	
}
class Cylinder1 extends Circle1
{  
	public int height;
	Cylinder1(int radius,int height)
	{
		super(radius);
		this.height=height;
	}
	public double volume()
	{
		return  Math.PI*radius*radius*height;
	}
	
	
}

class Rectangle1
{
	 int length;
     int breadth;
	
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getBreadth() {
		return breadth;
	}
	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}
	
	public int area() {
		return length*breadth;
	}
	public Rectangle1(int length, int breadth) {
		this.length = length;
		this.breadth = breadth;
	}
	
	
}

class Cuboid extends Rectangle1
{
	private int height;

	public Cuboid(int length, int breadth, int height) {
		super(length, breadth);
		this.height = height;
	}
	public int volume()
	{
		return length*breadth*height;
	}
	
	
}



public class Ch10_InheritancePSet {

	public static void main(String[] args)
	{
		
		//Problem1
	/*Cylinder1 obj=new Cylinder1(12,10);
	Circle1 obj2=new Circle1(12);
	System.out.println("Volume of cylinder :"+obj.volume());
  */
		
		//Problem 3
		Rectangle1 obj=new Rectangle1(3,4);
		System.out.println("Area of rectangle :"+obj.area());
		Cuboid obj2=new Cuboid(12,10,10);
		System.out.println(obj2.volume());
		
		
	}

}
