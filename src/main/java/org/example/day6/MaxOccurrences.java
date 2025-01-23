package org.example.day6;
/*
Write a method maxOccurrences that accepts a List of integers as a parameter and returns the number of times the most frequently occurring integer (the "mode") occurs in the list. Solve this problem using a Map as auxiliary storage. If the list is empty, return 0.
 */

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MaxOccurrences {
    public static void maxOccurrences(List<Integer> list){
        if (list.isEmpty()) {
            System.out.println("List is empty");
            return;
        }
        Map<Integer,Integer>frequencyMap =new HashMap<>();
    }

    public static void main(String[] args) {

    }
}
