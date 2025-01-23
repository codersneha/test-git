package org.example.day7.Exercises;
/*
Write a method removeEvenLength that takes a Set of strings as a parameter and that removes all of the strings of even length from the set. For example, if your method is passed a set containing the following elements:

["foo", "buzz", "bar", "fork", "bort", "spoon", "!", "dude"]
Your method should modify the set to store the following elements (the order of the elements does not matter):

["foo", "bar", "spoon", "!"]
 */

import java.util.Set;
import java.util.HashSet;

public class RemoveEvenLength {

    public static void removeEvenLength(Set<String>set) {
        Set<String>even =new HashSet<>();
        for (String str:set) {
            if (str.length()% 2== 0) {
                even.add(str);
            }
        }
    }

    public static void main(String[] args) {
        Set<String> set = Set.of("foo", "buzz", "bar", "fork", "bort", "spoon", "!", "dude");
        removeEvenLength(set);
        System.out.println(set);
    }
}
