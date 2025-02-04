package com.wipro.java.exception;

public class Checked {
    public static void main(String[] args) {
        try {
            throw new Exception("Checked error no error");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
