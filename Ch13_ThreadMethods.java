
package com.practice;



//void java.lang.Thread.join() throws InterruptedException ---- Waits for this thread to terminate. 
 
class MyThrNew1 extends Thread{
	public void run() {
		int i=0;
		while(i<50)
		{
			System.out.println("Thank you..");
			i++;
		}
	}
	
}

class MyThrNew2 extends Thread{
	public void run() {
		int i=0;
		while(i<40) {
			System.out.println("My Sweetheart..");
			try {
				Thread.sleep(450);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			i++;
		}
	}
	
}
 
public class Ch13_ThreadMethods {

	public static void main(String[] args) {
		 MyThrNew1 t1=new  MyThrNew1();
		 MyThrNew2 t2=new  MyThrNew2();
		 t1.start();
		 try {
			t1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		 t2.start();

	}

}
