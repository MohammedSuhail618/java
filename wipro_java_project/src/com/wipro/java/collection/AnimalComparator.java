package com.wipro.java.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// POJO Class (without implementing Comparable)
class AnimalComparator {
    private String name;
    private int age;

    // Constructor
    public AnimalComparator(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // toString method for printing
    @Override
    public String toString() {
        return name + " (Age: " + age + ")";
    }

    // Comparator for sorting by age (low to high)
    public static Comparator<Animal> AgeComparator = new Comparator<Animal>() {
        @Override
        public int compare(Animal a1, Animal a2) {
            return Integer.compare(a1.getAge(), a2.getAge()); // Ascending order of age
        }
    };

    // Comparator for sorting by name (alphabetical order)
    public static Comparator<Animal> NameComparator = new Comparator<Animal>() {
        @Override
        public int compare(Animal a1, Animal a2) {
            return a1.getName().compareTo(a2.getName()); // Sorting by name (alphabetical order)
        }
    };

    // Main method for testing
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal("Monkey", 5));
        animals.add(new Animal("Gorilla", 12));
        animals.add(new Animal("Lion", 20));
        animals.add(new Animal("Zebra", 11));

        // Sorting by Age using Comparator
        System.out.println("Animals sorted by Age (low to high):");
        Collections.sort(animals, AgeComparator);
        for (Animal animal : animals) {
            System.out.println(animal);
        }

        // Sorting by Name using Comparator
        System.out.println("\nAnimals sorted by Name (alphabetical order):");
        Collections.sort(animals, NameComparator);
        for (Animal animal : animals) {
            System.out.println(animal);
        }
    }
}