package com.wipro.java.oops.encapsulation;

public class Animal extends Object {
	
	private String species;
	private int teeth;
	

	public Animal(String species, int teeth) {
		super();
		this.species = species;
		this.teeth = teeth;
	}
	
	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}

	public int getTeeth() {
		return teeth;
	}
	public void setTeeth(int teeth) {
		if(teeth<10) {
		  
		  System.out.println("Its a baby with less than 10 teeth.");
		}
		else {
			this.teeth = teeth;	
		}
		
	}

	public static void main(String[] args) {
		
		Animal a1 = new Animal("Tiger",20);
		
	    // Using species and age fields
		System.out.println("Species : " +a1.getSpecies());
		System.out.println("Teeth : " +a1.getTeeth());
		System.out.println();
		
		a1.setSpecies("Lion");
		a1.setTeeth(11);
		System.out.println("Updated Species: " +a1.getSpecies());
		System.out.println("Updated Teeth: " + a1.getTeeth());
		System.out.println();
		
		a1.setTeeth(5);
	}

}