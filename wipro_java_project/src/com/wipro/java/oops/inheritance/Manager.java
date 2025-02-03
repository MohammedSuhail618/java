package com.wipro.java.oops.inheritance;

//employee=parent classs
//manager=child class
//extends=is a keyword
public class Manager extends employee {

	public Manager() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String a[])
	{
		//child class is initiated from child constructor
		//parent class consumes the properties of child class
		employee employee = new Manager();
		employee.setEmpId(10);
		employee.setEmpName("Suresh");
		employee.setEmpAge(29);
		
		System.out.println(employee.getEmpId());
		System.out.println(employee.getEmpName());
		System.out.println(employee.getEmpAge());
	}
}
