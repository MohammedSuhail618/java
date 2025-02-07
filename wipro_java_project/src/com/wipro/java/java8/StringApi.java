package com.wipro.java.java8;

public class StringApi {

    public StringApi() {
        
    }

    public static void main(String[] args) {
        String str = "SampleString";
        System.out.println(str.length());
        System.out.println(str.charAt(1));
        System.out.println(str.substring(1, 4));
        System.out.println(str.contains("m"));
        String[] a = str.split(" ");

        for (String str1 : a) {
            System.out.println(str1);
        }
    }
}
