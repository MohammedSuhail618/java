package com.wipro.java.collection.hashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class Student {
    String name;
    int rollNumber;

    public Student(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(rollNumber);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Student student = (Student) obj;
        return rollNumber == student.rollNumber;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Roll Number: " + rollNumber;
    }
}

class StudentMap {
    private HashMap<Integer, List<Student>> map = new HashMap<>();

    public void insert(Student student) {
        map.computeIfAbsent(student.rollNumber, k -> new ArrayList<>()).add(student);
    }

    public Student get(int rollNumber) {
        List<Student> students = map.get(rollNumber);
        return (students != null && !students.isEmpty()) ? students.get(0) : null; // Return first if multiple
    }

    public void remove(int rollNumber) {
        map.remove(rollNumber);
    }

    public void display() {
        map.forEach((roll, students) -> {
            System.out.println("Roll " + roll + ": " + students);
        });
    }

    public static void main(String[] args) {
        StudentMap studentMap = new StudentMap();

        studentMap.insert(new Student("Alice", 101));
        studentMap.insert(new Student("Bob", 102));
        studentMap.insert(new Student("Charlie", 103));
        studentMap.insert(new Student("Alice", 104)); // Duplicate name
        studentMap.insert(new Student("David", 105));
        studentMap.insert(new Student("Eve", 106));
        studentMap.insert(new Student("Frank", 107));
        studentMap.insert(new Student("Grace", 108));
        studentMap.insert(new Student("Bob", 109));  // Duplicate name
        studentMap.insert(new Student("Heidi", 110));

        System.out.println("Student Map Contents:");
        studentMap.display();

        Student foundStudent = studentMap.get(105);
        System.out.println("\nFound student with roll number 105: " + foundStudent);

        studentMap.remove(102);
        System.out.println("\nStudent Map Contents after removing roll number 102:");
        studentMap.display();
    }
}