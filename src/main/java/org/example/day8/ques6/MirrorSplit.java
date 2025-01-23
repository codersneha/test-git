package org.example.day8.ques6;

import java.util.Queue;
import java.util.LinkedList;
import java.util.Stack;

public class MirrorSplit {
    public static void mirrorSplit(Stack<Integer> stack) {
        Queue<Integer> queue = new LinkedList<>();
        while(!stack.isEmpty()) {
            queue.add(stack.pop());
        }
        //reverse the queue
        //[14,20,8,12]
        //stack[7,10,4,6]
        //queue[7,10,4,6]
        int size = queue.size();
        while (size-->0){
            int num= queue.remove();
            int first=num/2;
            int second=num-first;
            stack.push(first);
            queue.add(second);
        }
        while(!queue.isEmpty()) {
            stack.push(queue.remove());
        }
    }
    public static void s2q(Stack<Integer> s, Queue<Integer> q) { while (!s.isEmpty()) {
        q.add(s.pop()); }
    }
    public static void q2s(Queue<Integer> q, Stack<Integer> s) { while (!q.isEmpty()) {
        s.push(q.remove()); }
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(14);
        stack.push(20);
        stack.push(8);
        stack.push(12);
        System.out.println(stack);
        mirrorSplit(stack);
        System.out.println(stack);
    }
}
