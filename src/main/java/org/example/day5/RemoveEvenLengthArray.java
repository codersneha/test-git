package org.example.day5;
/*
Write a method removeEvenLength that takes an ArrayList of Strings as a parameter and that removes all of the strings of even length from the list.
 */

import java.util.ArrayList;

public class RemoveEvenLengthArray {
    public static void removeEvenLength(ArrayList<String> list){
        if (list.isEmpty()) {
            return;
        }
        for (int i = 0; i < list.size();){
            if (list.get(i).length()% 2== 0) {
                list.remove(i);
            } else {
                i++;
            }
        }
    }
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("hello");
        list.add("world");
        list.add("java");
        list.add("code");
        System.out.println("Before: "+list);
        removeEvenLength(list);
        System.out.println("After: "+list);
    }
}
