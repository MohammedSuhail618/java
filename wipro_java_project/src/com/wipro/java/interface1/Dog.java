package com.wipro.java.interface1;



public class Dog implements Animal {

    @Override
    public void makesound() {
        // TODO Auto-generated method stub
        System.out.println("bark");
    }

    public static void main(String[] args) {
        Animal dog1 = new Dog();
        dog1.makesound();
    }

}