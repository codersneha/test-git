package org.example.day7.Exercises;

/* Write a method equals that takes as parameters two stacks of integers and
 * returns true if the two stacks are equal and that returns false otherwise.
 * To be considered equal, the two stacks would have to store the same
 * sequence of integer values in the same order. Your method is to examine the
 * two stacks but must return them to their original state before terminating.
 * You may use one stack as auxiliary storage.
 */


import java.util.Stack;

public class Equals {
    public static Boolean equals(Stack<Integer> s1, Stack<Integer> s2){
        int size1=s1.size();
        int size2=s2.size();

        if(size1!=size2){
            return false;
        }

        Stack<Integer> newStack = new Stack<>();
        while(!s1.isEmpty()) {
            int a = s1.pop();
            int b = s2.pop();
            if (a != b) {
                return false;
            }
            newStack.push(a);
            newStack.push(b);
        }
        while(!newStack.isEmpty()) {
            s2.push(newStack.pop());
            s1.push(newStack.pop());
        }
        return true;
    }

    public static void main(String[] args) {
        Stack<Integer> s1 = new Stack<>();
        s1.push(1);
        s1.push(2);
        s1.push(3);

        Stack<Integer> s2 = new Stack<>();
        s2.push(1);
        s2.push(2);
        s2.push(3);

        System.out.println(equals(s1, s2));
    }

}
