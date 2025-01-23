package org.example.day7.Exercises;

import java.util.HashSet;
import java.util.Set;

/*
Write a method maxLength that takes a Set of strings as a parameter and that returns the length of the longest string in the set. If your method is passed an empty set, it should return 0.
 */

public class MaxLength {
    public static void maxLength(Set<String> set){
        int max=0;
        for (String s : set) {
            if (s.length() > max){
                max=s.length();
            }
        }
        System.out.println(max);
    }

    public static void main(String[] args) {
        Set<String> set1 = Set.of("a","abc","abcdef","abcd","ab","abcde");
        maxLength(set1);
        Set<String> set2 = Set.of();
        maxLength(set2);

    }
}
