package com.wipro.java.exception;

public class Unchecked {
    public static void main(String[] args) {
        try {
            throw new RuntimeException("Unchecked error");
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }
}