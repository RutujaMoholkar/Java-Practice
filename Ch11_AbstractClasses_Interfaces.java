package com.practice;

/* It is possible to create reference of abstract class.
 * subclass usually provides implementation for all abstract methods in its parent class.
     if it doesn't then subclass must be declared as abstract. 
 *abstract class ----> abstract methods,non abstract methods,fields
 *We can assign ref of abstract to object of concrete class
 *interface------>methods signature,default methods,constant fields,static methods,private methods
 *we can't modify the properties in interface as they are final
 *interfaces can extends another interfaces
 */
abstract class Shape{
	abstract int area();
}
//the methods in interface are public and abstract by default..so we have to change the visibility of methods to public
interface Bicycle{
	int a=90;
	void applyBrake(int decrement);
	void speedUp(int increment);
}
class AonCycle implements Bicycle
{   
	int speed=8;
	public void applyBrake(int decrement) 
	{
		speed=speed-decrement;
		System.out.println("decrement :"+speed);

	}
   public void speedUp(int increment)
	{
		speed=speed+increment;
		System.out.println("incremant :"+speed);

	}
	
}

interface Camera{
	void takeSnap();
	void recordVideo();
	static void greet() {
		System.out.println("Good Morning");
	}
	
	default void take4KVideo() //helps us to add new functionality to the existence interface
	{
		greet();
		System.out.println("Recording 4k video");
	}
	
}
interface Wifi{
	String [] checkNetwork();
	void connectNetwork(String network);
}
class Phone2{
	void calling(int number)
	{
		System.out.println("Trying to call on this number :"+number);
	}
}
class SmartPhone2 extends Phone2  implements Camera,Wifi{

	public String[] checkNetwork() {
		String [] networkList= {"suraj","mahi007","amazon123","jfs789"};
		return networkList;
	}

	public void connectNetwork(String network) {
		System.out.println("Connecting to the network.."+network);
	 
	}

	public void takeSnap() {
		System.out.println("Taking the snap..");
	}
	public void recordVideo() {
		System.out.println("Recording video..");
	}
	
}
interface SampleInterface{
	void meth1();
	void meth2();
}

interface ChildInterface extends SampleInterface{
	/*void meth1(); there is a concept of don't repeat yourself (DRY)
	void meth2();
	*/
	void meth3();
	void meth4();
}

class SampleClass implements ChildInterface{
	public void meth3() {
		System.out.println("meth3");
	}
	public void meth4() {
		System.out.println("meth4");
	}
	public void meth1() {
		System.out.println("meth1");
	}
	public void meth2() {
		System.out.println("meth2");
	}
}



public class Ch11_AbstractClasses_Interfaces 
{

	public static void main(String[] args)
	{
	/*Bicycle b1=new AonCycle();
	b1.applyBrake(6);
	b1.speedUp(20);
	//b1.a=90; not allowed since a field is final

		Wifi wf=new SmartPhone2();
		String[] str=wf.checkNetwork();
		for(String network:str)
		{
			System.out.println(network);
		}
	 wf.connectNetwork("suraj");
	 //wf.takesnap(); not allowed reference is of the type of wifi so methods of wifi interface are called only.
	 SmartPhone2 s2=new SmartPhone2();
	s2.takeSnap();
	s2.calling(67890);
	s2.connectNetwork("mahi007");
	Camera c1=new SmartPhone2();
	c1.take4KVideo();
*/	
		SampleInterface s1=new SampleClass();
		//s1.meth1();//allowed
		//s1.meth2();//allowed
		//s1.meth3(); not allowed
		SampleClass sc=new SampleClass();
		sc.meth1();
		sc.meth2();
		sc.meth3();
		sc.meth4();
		
		
	}

}
