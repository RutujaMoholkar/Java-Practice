package com.practice;

 class Employee
 {
	 int id;
	 String userName;
	 int salary;
	 public void printDetails() {
		 System.out.println("My UserName is "+userName+" & my id is : "+id);
	 }
	 public int getSalary() 
	 {
		 return salary;
		 
	 }
	
}


public class Cwh38_CustomeClass {

	public static void main(String[] args) 
	{
		System.out.println("Creating a custome class");
		 Employee rutuja = new Employee();
		 rutuja.id=567;
		 rutuja.userName="CoderRutuja";
		 rutuja.printDetails();
		 rutuja.salary=45000;
		 int empSalary=rutuja.getSalary();
		 System.out.println("Employee salary is "+empSalary);
		 
		 
	}

}
