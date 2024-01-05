package com.practice;

abstract class Pen
{
	abstract void write();
	abstract void refill();
}

class FountainPen extends Pen
{

	@Override
	void write() {
		System.out.println("Writing using Pen..");
	}
	@Override
	void refill() {
		System.out.println("Refilling the pen..");
	}
	void changeNib()
	{
		System.out.println("Nib is chaning..");
	}
	
}

class Monkey{
	void jump() {
		System.out.println("Monkey is jumping..");
	}
	void bite() {
		System.out.println("Monkey can bite..");
	}
}
interface BasicAnimal{
	void eat();
	void sleep();
}
class Human extends Monkey implements BasicAnimal{

	public void eat() {
		System.out.println("Monkey is eating..");
	}

	public void sleep() {
		System.out.println("Monkey is sleeping..");
	}
	
	public void speak() {
		System.out.println("Monkey is speaking..");
	}
	
}

interface TVRemote{
	void changeChannel();
	void turnOffTV();
	
}
interface SmartTVRemote extends TVRemote{
	void useAsACController();
	
}

class TV implements SmartTVRemote{

	@Override
	public void useAsACController() {
	    System.out.println("AC is controlled..");
	}

	@Override
	public void changeChannel() {
	    System.out.println("Channel is changing..");
	}

	@Override
	public void turnOffTV() {
		System.out.println("Tv turns off..");
	}
	
}
class Super{
	void meth1() {
		System.out.println("Meth1");
	}
	void meth2() {
		System.out.println("meth2");
	}
}
class SubClass extends Super{
	void meth2() {
		System.out.println("Method 2");
	}
	void meth3() {
		System.out.println("meth3");
	}
	
}

abstract class Telephone{
	abstract void ring();
	abstract void lift();
	abstract void disconnect();
}

class SmartTelephone extends Telephone{

	@Override
	void ring() {
		System.out.println("Ring rong..");
	}

	@Override
	void lift() {
	System.out.println("Connecting the phone..");
	}

	@Override
	void disconnect() {
		System.out.println("Disconnecting the phone..");
	}
	  void camera()
	  {
		  System.out.println("Taking snap..");
	  }
}
public class Ch11_PS
{

	public static void main(String[] args)
	{
		/*
		 * Problem 1 & 2
		 Pen p1=new FountainPen();
		//p1.changeNib();  we can call the specialized methods of fontainPen
		p1.write();
		p1.refill();
   
		
		//Problem 3 & 5
		Human harry=new Human();
		harry.sleep();
		
		Monkey m1=new Human();
		//m1.speak(); can't use speak() becoz the ref is monkey which does not have speak()..
		 //we can use the methods of monkey as we passses the ref of monkey
		m1.bite();
		m1.jump();
		
		BasicAnimal lavish=new Human();
		//lavish.speak();
		lavish.eat();
		lavish.sleep();

		TVRemote tr=new TV();
		tr.changeChannel();
		tr.turnOffTV();
	
		SmartTVRemote str=new TV();//it can invoke the methods of both the interfaces0
		str.useAsACController();
		str.changeChannel();
		str.turnOffTV();
	  */	
		Telephone st=new SmartTelephone();
		st.disconnect();
		st.lift();
		st.ring();
		//st.camera();
	}

}
