package org.example.day5;

/*
* Write a method swapPairs that switches the order of values in an ArrayList of Strings in a pairwise fashion. Your method should switch the order of the first two values, then switch the order of the next two, switch the order of the next two, and so on. For example, if the list initially stores these values: {"four", "score", "and", "seven", "years", "ago"} your method should switch the first pair, "four", "score", the second pair, "and", "seven", and the third pair, "years", "ago", to yield this list: {"score", "four", "seven", "and", "ago", "years"}

If there are an odd number of values in the list, the final element is not moved. For example, if the original list had been: {"to", "be", "or", "not", "to", "be", "hamlet"} It would again switch pairs of values, but the final value, "hamlet" would not be moved, yielding this list: {"be", "to", "not", "or", "be", "to", "hamlet"}
* */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class ArraySwapPairs {

    public static void swapPair(ArrayList<String> list) {
        if (list.size() < 2) {
            return;
        }
        for (int i = 0; i < list.size() - 1; i += 2) {
            String temp=list.get(i);
            list.set(i,list.get(i+1));
            list.set(i+1,temp);
        }
    }

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("to");
        list.add("be");
        list.add("or");
        list.add("not");
        list.add("to");
        list.add("be");
        list.add("hamlet");

        System.out.println("before swapping: "+ list );
        ArraySwapPairs.swapPair(list);
        System.out.println("after swapping: "+ list );
    }
}