package com.wipro.java.oops.inheritance;

/** parentclass= employee
 * child class = Projectlead
 * extends=is a keyword
 */
public class Projectlead extends employee{

	public Projectlead() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String a[])
	{
		//child class is initiated from child constructor
		//parent class consumes the properties of child class
		employee employee = new Projectlead();
		employee.setEmpId(123);
		employee.setEmpName("Yash");
		employee.setEmpAge(34);
		System.out.println(employee.getEmpId());
		System.out.println(employee.getEmpName());
		System.out.println(employee.getEmpAge());
	}
}
