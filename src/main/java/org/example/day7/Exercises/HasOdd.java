package org.example.day7.Exercises;

import java.util.HashSet;
import java.util.Set;
/*
Write a method hasOdd that takes a Set of integers as a parameter and that returns true if the set contains at least one odd integer, and false otherwise. If passed the empty set, your method should return false.
 */

public class HasOdd {
    public static void hasOdd(Set<Integer> set) {
        for (Integer num : set) {
            if (num% 2!=0) {
                System.out.println(true);
                return;
            }
        }
        System.out.println(false);
    }
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        set1.add(2);
        set1.add(4);
        set1.add(6);
        set1.add(8);
        set1.add(10);

        Set<Integer> set2 = new HashSet<>();
        set2.add(1);
        set2.add(2);
        set2.add(3);
        set2.add(4);
        set2.add(5);

        Set<Integer> set3 = new HashSet<>();

        hasOdd(set1);
        hasOdd(set2);
        hasOdd(set3);
    }

}

