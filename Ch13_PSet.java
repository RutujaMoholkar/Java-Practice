package com.practice;

class MyThread3 extends Thread{
	public void run() {
		int i=0;
		while(i<40)
		{
			System.out.println("WELCOME!!");
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			i++;
		}
	}
}

class MyThread4 extends Thread{
	public void run() {
		int i=0;
	while(i<40)
	{
		System.out.println("GOOD MORNING!!");
		i++;
	}
	}
}


public class Ch13_PSet {
	public static void main(String[] args)
	{
		MyThread3 t1=new MyThread3();
		MyThread4 t2=new MyThread4();
		t1.start();
		t2.start();
		t2.setPriority(Thread.MAX_PRIORITY);
		t2.setPriority(7);
		t1.setPriority(Thread.MIN_PRIORITY);
		System.out.println("Priority of thread3 is:"+t1.getPriority());
		System.out.println("Priority of thread4 is: "+t2.getPriority());
		System.out.println("State of the thread is: "+t1.getState());
		System.out.println("Id of the thread :"+t1.getId());
		System.out.println("Reference of the current thread: "+Thread.currentThread());
		System.out.println("Reference of the current thread: "+Thread.currentThread().getState());

	}

}
