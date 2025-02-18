package com.wipro.java.collection.treemap;

import java.util.*;

public class SortLinkedList {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>(Arrays.asList("Banana","Strawberry","Pineapple","Cherry", "Apple", "Orange"));

        // Sort using a custom comparator (alphabetical order)
        list.sort(Comparator.naturalOrder());

        System.out.println("Sorted list: " + list); 
    }
}