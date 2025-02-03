package com.wipro.java.oops;
/*Parent class=employee
 * child class=Developer
 * extends=is a keyword
 */
public class Developer extends employee {

	public Developer() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String a[])
	{
		//child class is initiated from child constructor
		//parent class consumes the properties of child class
		employee employee=new Developer();
		employee.setEmpId(100);
		employee.setEmpName("Ramesh");
		employee.setEmpAge(45);
		
		System.out.println(employee.getEmpId());
		System.out.println(employee.getEmpName());
		System.out.println(employee.getEmpAge());
	}

}
