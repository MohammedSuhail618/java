package com.wipro.java.java8;



import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApi1 {

    public static void main(String[] args) {
        List<Integer> numbers1 = Arrays.asList(8, 2, 9, 1, 4);
        List<Integer> numbers2 = Arrays.asList(15, 20, 30, 40, 69);
        
        List<Integer> sortedNumbers = numbers1.stream().sorted().collect(Collectors.toList());
        System.out.println("Sorted numbers of numbers1 (Ascending Order): " + sortedNumbers);
        
        List<Integer> sortedNumbers1 = numbers1.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println("Sorted numbers of numbers1 (Descending Order): " + sortedNumbers1);
        System.out.println("\n");
        int max = numbers2.stream().max(Integer::compare).orElseThrow();
        int min = numbers2.stream().min(Integer::compare).orElseThrow();
        
        
        System.out.println("Maximum value in numbers2: " + max);
        System.out.println("Minimum value in numbers2: " + min);
        
    }
}