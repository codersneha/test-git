package org.example.day7.Exercises;

import java.util.LinkedList;
import java.util.List;
import java.util.HashSet;
import java.util.Set;

/*
Write a method countCommon that takes two Lists of integers as parameters and returns the number of unique integers that occur in both lists. Use one or more Sets as storage to help you solve this problem.

For example, if one list contains the values [3, 7, 3, -1, 2, 3, 7, 2, 15, 15] and the other list contains the values [-5, 15, 2, -1, 7, 15, 36], your method should return 4 (because the elements -1, 2, 7, and 15 occur in both lists).
 */

public class CountCommon {
    public static int countCommon(List<Integer> list1, List<Integer> list2) {
        Set<Integer> set1 = new HashSet<>(list1);
        Set<Integer> set2 = new HashSet<>(list2);

        int count = 0;
        for (Integer num:set1) {
            if (set2.contains(num)){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        List<Integer> list1 = List.of(3, 7, 3, -1, 2, 3, 7, 2, 15, 15);

        LinkedList<Integer> list2 = new LinkedList<>();
        list2.add(-5);
        list2.add(15);
        list2.add(2);
        list2.add(-1);
        list2.add(7);
        list2.add(15);
        list2.add(36);

        System.out.println(countCommon(list1, list2));
    }
}
