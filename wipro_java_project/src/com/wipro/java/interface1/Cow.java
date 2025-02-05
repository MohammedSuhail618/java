package com.wipro.java.interface1;



public class Cow implements Animal {

    @Override
    public void makesound() {
        // TODO Auto-generated method stub
        System.out.println("humba"); 
    }

    public static void main(String[] args) {
        Animal cow1 = new Cow();
        cow1.makesound();
    }
}