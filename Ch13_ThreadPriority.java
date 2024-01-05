package com.practice;

//which thread gets executed is highly dependent on the os
class MyThr extends Thread{
	public MyThr(String name) {
		super(name);
	}
	public void run() {
		int i=0;
		//while(i<400) 
			System.out.println("Thread is running : "+this.getName());
			//i++;
		}
	}

// Ready queue ---read to run t1 t2 t3 t4 t5 -------- jvm maintain --to provide cpu
public class Ch13_ThreadPriority {

	public static void main(String[] args) 
	{
		MyThr t1=new MyThr("Rutuja");
		MyThr t2=new MyThr("harry");
		MyThr t3=new MyThr("tiger");
		MyThr t4=new MyThr("parrot");
		MyThr t5=new MyThr("peacock");
	    t4.setPriority(Thread.MAX_PRIORITY); //10
	    t2.setPriority(Thread.MIN_PRIORITY); //1
	    t3.setPriority(Thread.NORM_PRIORITY); //5
	    t1.start();
	    t2.start();
	    t3.start();
	    t4.start();
	    t5.start();
	   System.out.println(t1.getPriority());
	   System.out.println(t2.getPriority());
	   System.out.println(t3.getPriority());
	   System.out.println(t4.getPriority());
	   System.out.println(t5.getPriority());



	}

}
