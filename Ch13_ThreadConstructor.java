package com.practice;



class MyRunnableInterface implements Runnable{
	@Override
	public void run() {
			System.out.println("I am Runnable implemeted thread");
		
	}	
}

class MyThread extends Thread{
	public MyThread(String name) {
		super(name);
	}
	public void run() {
		System.out.println("Thread is running");
	}
}

public class Ch13_ThreadConstructor {

	public static void main(String[] args)
	{

		
		//creating the object of MyRunnableInterface 
		MyRunnableInterface r1=new MyRunnableInterface();
		Thread gun1=new Thread(r1,"Mynew thread");
		gun1.start();
		System.out.println("Name of the thread :"+gun1.getName());
		System.out.println("Id of the thread is: "+gun1.getId());
		
		MyThread t1=new MyThread("chanda");
		t1.start();
		System.out.println("Name of the thread:"+t1.getName());
		System.out.println("Id of the thread:"+t1.getId()); 
		
	}

}
