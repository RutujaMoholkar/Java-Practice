package com.practice;


class Cylinder
{
	private float radius;
    private float height;
	public void setHeight(float h1)
	{
		height=h1;
	}
	public void setRadius(float r1)
	{
		radius=r1;
	}
	public float getHeight()
	{
		return height;
	}
	public float getRadius()
	{
		return radius;
	}
	public float surfaceArea()
	{
		return 2 * 3.142f *radius*radius + 2*3.142f*radius*height;
	}
	public float volume()
	{
		return 3.14f * radius *radius *height;
	}
	
	public Cylinder(float radius, float height) {
		super();
		this.radius = radius;
		this.height = height;
	}
	
}

class Rectangle
{
	private int length;
	private int breadth;
	public Rectangle() 
	{
		super();
		this.length = 4;
		this.breadth = 5;
	}
	public Rectangle(int length, int breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}
	public int getLength() {
		return length;
	}
	public int getBreadth() {
		return breadth;
	}
	
	
}
public class Ch9_Pset {

	public static void main(String[] args) 
	{
/*
 		//Problem 1		
	    Cylinder c1=new Cylinder();
		c1.setHeight(12f);
		c1.setRadius(9f);
		System.out.println("Height of cylinder :"+c1.getHeight());
		System.out.println("Radius of cylinder :"+c1.getRadius());
		
		//Problem 2 
		System.out.println("Surface area of cylinder is: "+c1.surfaceArea());
		System.out.println("Volume of cylinder :"+c1.volume());
		
		Cylinder c2=new Cylinder(12,9);
*/
		
		//Problem 4
		  Rectangle r1=new Rectangle();
		  System.out.println(r1.getLength());
		  System.out.println(r1.getBreadth());
		  
		  System.out.println("Parameterized constrictor :");
		  Rectangle r2= new Rectangle(45,87);
		  System.out.println(r2.getLength());
		  System.out.println(r2.getBreadth());
		  
	}

}
