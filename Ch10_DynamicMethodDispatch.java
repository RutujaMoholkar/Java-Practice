package com.practice;


class Phone
{
	public void showTime()
	{
		System.out.println("It is 5pm in the evening.");
	}
	public void on()
	{
		System.out.println("Turning on phone...");
	}
}
class SmartPhone extends Phone
{
	public void music()
	{
		System.out.println("Playing music ...");
	}
	public void on()
	{
		System.out.println("Turning on smartphone ...");
	}
}

public class Ch10_DynamicMethodDispatch 
{

	public static void main(String[] args) 
	{
		/*Phone obj=new Phone();
		obj.on();
		obj.showTime();
		
		
		SmartPhone obj2=new SmartPhone();
		obj2.on();
		*/
		Phone obj3=new SmartPhone();//only call overridden and inherited method
		obj3.on();
		obj3.showTime();
		//obj3.music(); compilation error it can't execute specialized methods
	
	}

}
