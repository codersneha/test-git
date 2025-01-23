package org.example.day7.Exercises;

import java.util.LinkedList;
import java.util.List;
import java.util.HashSet;
import java.util.Set;

/*
Write a method countUnique that takes a List of integers as a parameter and returns the number of unique integer values in the list. Use a Set as auxiliary storage to help you solve this problem.

For example, if a list contains the values [3, 7, 3, -1, 2, 3, 7, 2, 15, 15], your method should return 5. The empty list contains 0 unique values.
 */

public class CountUnique {
    public static int countUnique(List<Integer> list){
        Set<Integer>uniqueSet= new HashSet<>(list);
        return uniqueSet.size();
    }
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        list.add(3);
        list.add(7);
        list.add(3);
        list.add(-1);
        list.add(2);
        list.add(3);
        list.add(7);
        list.add(2);
        list.add(15);
        list.add(15);
        System.out.println(countUnique(list));

        List<Integer> emptyList = new LinkedList<>();
        System.out.println(countUnique(emptyList));
    }
}
