package com.practice;

class MyThread1 extends Thread
{
	@Override
	public void run() {
		int i=0;
		while(i<4000)
		{
			System.out.println("Cooking Thread");
		    System.out.println("I am happy");
		    i++;
		}
	}
}
class MyThread2 extends Thread
{

	public void run()
	{
		int i=0;
		while(i<4000)
		{
			System.out.println("Chatting Thread");
		    System.out.println("I am sad");
		    i++;
		}
	}
	
}

public class Ch13_MultithreadingThreadClass {

	public static void main(String[] args)
	{
		MyThread1 t1=new MyThread1();
		MyThread2 t2=new MyThread2();
		t1.start();
		t2.start();
	
	}

}
