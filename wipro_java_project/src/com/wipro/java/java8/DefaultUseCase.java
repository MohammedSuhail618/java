package com.wipro.java.java8;

interface TestInterface2 {
    void square(int a);

    static String show() {
        return "Static Method Executed";
    }
}

public class DefaultUseCase implements TestInterface2 {

    @Override
    public void square(int a) {
        System.out.println("Square of " + a + " is: " + (a * a));
    }

    public static void main(String[] args) {
        DefaultUseCase obj = new DefaultUseCase();
        obj.square(9);
        System.out.println(TestInterface2.show());
    }
}