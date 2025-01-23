package org.example.day5;

import java.util.Stack;
import java.util.ArrayList;
/*
Write a method stutter that takes a stack of integers as a parameter and replaces every value in the stack with two occurrences of that value. For example, suppose the stack stores these values:

bottom [3, 7, 1, 14, 9] top
Then the stack should store these values after the method terminates:

bottom [3, 3, 7, 7, 1, 1, 14, 14, 9, 9] top
Notice that you must preserve the original order. In the original list the 9 was at the top and would have been popped first. In the new stack the two 9s would be the first values popped from the stack. You may use a single queue as auxiliary storage to solve this problem.
 */

public class StutterStack {

    public static void stutter(Stack<Integer> stack) {
        ArrayList<Integer> temp = new ArrayList<>();
        int size= stack.size();
        for (int i = 0; i < size; i++) {
            temp.add(stack.pop());
        }
        for (int i=size-1;i>=0;i--){
            int num=temp.get(i);
            stack.push(num);
            stack.push(num);
        }
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(3);
        stack.push(7);
        stack.push(1);
        stack.push(14);
        stack.push(9);
        System.out.println("Before: "+stack);
        stutter(stack);
        System.out.println("After: "+stack);
    }

}
