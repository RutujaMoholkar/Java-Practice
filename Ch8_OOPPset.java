package com.practice;

class Emp{
	int salary;
	String name;
	public int getSalary()
	{
		return salary;
	}
	public void setName(String empName) {
		name=empName;
	}
	public String getName()
	{
		return name;
	}
}


class CellPhone{
	public void vibrating()
	{
		System.out.println("Phone is vibrating");
	}
	public void ringing()
	{
		System.out.println("Phone is ringing");
	}
}


class Square
{
	float side;
	public void setSide(float side)
	{
		this.side=side;
	}
	public void area()
	{
		System.out.println("Area of square is :"+(side*side));
	}
	public void perimeter()
	{
		System.out.println("Perimeter of square is :"+(4*side));
	}
}


class TommyVeceti
{
	public void running()
	{
		System.out.println("Running ...");
	}
	public void hitting()
	{
		System.out.println("Hitting ...");
	}
	public void fireing()
	{
		System.out.println("fireing ...");
	}
	
}


class Circle
{
	float radius;
	final float pi=3.14f;
	public void setRadius(float radius)
	{
		this.radius=radius;
	}
	public void calculateArea() {
		System.out.println("area of circle is :"+(pi*radius*radius));
	}
	public void calculatePeri()
	{
		System.out.println("Perimeter of circle is :"+(2*pi*radius));
	}
}

public class Ch8_OOPPset {

	public static void main(String[] args) 
	{
		/*
		 
		 Emp rutuja=new Emp();
		rutuja.salary=89000;
		int empsal=rutuja.getSalary();
        System.out.println(empsal);	
        rutuja.setName("CoderThunder");
        String name=rutuja.getName();
        System.out.println("Emp's name:"+name);
     
				
		CellPhone oppo=new CellPhone();
		oppo.ringing();
		oppo.vibrating();
	
	
		Square abcd= new  Square();
		abcd.setSide(1.2f);
		abcd.area();
		abcd.perimeter();
		
		
		
		 TommyVeceti rockstar=new  TommyVeceti();
		 rockstar.fireing();
		 rockstar.hitting();
		 rockstar.running();
		
		
		
		Circle smallCircle=new Circle();
		smallCircle.setRadius(1.2f);
		smallCircle.calculateArea();
		smallCircle. calculatePeri();
		*/
	}

}
