/**
 * 
 */
package com.wipro.java.oops;

/**No constructor
 * Getters have return value
 * setters have no return value
 * properties are determined using private fields
 * values are behaviours are determined to setters
 * 
 */
public class animal {
	private String species;//animal species
	private int age;//animal age
	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = "Aquatic";
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = 5;
	}

	;

	/**
	 * 
	 */
	public animal() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
