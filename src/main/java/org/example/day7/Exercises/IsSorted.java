package org.example.day7.Exercises;

/* Write a method isSorted that accepts a stack of integers as a parameter and
 * returns true if the elements in the stack occur in ascending
 * (non-decreasing) order from top to bottom, and false otherwise. That is,
 * the smallest element should be on top, growing larger toward the bottom. An
 * empty or one-element stack is considered to be sorted. When your method
 * returns, the stack should be in the same state as when it was passed in. In
 * other words, if your method modifies the stack, you must restore it before
 * returning. You may use one queue or stack (but not both) as auxiliary
 * storage. Your solution should run in O(N) time, where N is the number of
 * elements of the stack.
 */
import java.util.Stack;

public class IsSorted {
    public static Boolean isSorted(Stack<Integer> s1) {
        if (s1.isEmpty() || s1.size() == 1) {
            return true;
        }
        Stack<Integer> newStack = new Stack<>();
        int a = s1.pop();
        newStack.push(a);

        while (!s1.isEmpty()) {
            int b = s1.pop();

            if (b < a) {
                return false;
            }
            a = b;
            newStack.push(a);
        }
        while (!newStack.isEmpty())
            s1.push(newStack.pop());

        return true;
    }

    public static void main(String[] args) {
        Stack<Integer> s1 = new Stack<>();
        s1.push(1);
        s1.push(4);
        s1.push(3);
        s1.push(2);
        s1.push(5);

        System.out.println(isSorted(s1));
    }
}