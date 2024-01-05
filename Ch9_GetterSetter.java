package com.practice;


class MyEmployee{
	private int id;
	private String name;
	
	public void setName(String n) {
		name=n;
	}
	
	public String getName() {
		return name;
		
	}
	public void setId(int empId) {
		id=empId;
	}
	
	public int getId() {
		return id;
		
	}
}
public class Ch9_GetterSetter {

	public static void main(String[] args)
	{
		MyEmployee emp=new MyEmployee();
		//emp.name="rutuja";    throws error due to private access modifier
		emp.setId(34);
		System.out.println(emp.getId());
		emp.setName("krishna");
		System.out.println(emp.getName());
		

	}

}
