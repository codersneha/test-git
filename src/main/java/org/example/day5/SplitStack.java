package org.example.day5;
/*
Write a method splitStack that takes a stack of integers as a parameter and splits it into negatives and non-negatives. The numbers in the stack should be rearranged so that all the negatives appear on the bottom of the stack and all the non-negatives appear on the top. In other words, if after this method is called you were to pop numbers off the stack, you would first get all the nonnegative numbers and then get all the negative numbers. It does not matter what order the numbers appear in as long as all the negatives appear lower in the stack than all the non-negatives. You may use a single queue as auxiliary storage.
 */

import java.util.ArrayList;
import java.util.Stack;

public class SplitStack {
    public static void splitStack(Stack<Integer> stack){
        Stack<Integer> nonNeg = new Stack<>();
        Stack<Integer> negStack = new Stack<>();

        int size= stack.size();
        for(int i=0; i<size; i++){
            int num = stack.pop();

            if (num >=0 ){
                nonNeg.push(num);
            } else {
                negStack.push(num) ;
            }
        }
        while(!negStack.isEmpty()){
            stack.push(negStack.pop());
        }
        while(!nonNeg.isEmpty()){
            stack.push(nonNeg.pop());
        }
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(5);
        stack.push(-2);
        stack.push(8);
        stack.push(-3);
        stack.push(7);
        stack.push(-1);
        System.out.println("Before: "+stack);
        splitStack(stack);
        System.out.println("After: "+stack);
    }
}
