package org.example.test2.ques6;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Alphabetize {
    public static void alphabetize(Queue<String> q) {
        Stack<String> stack1 = new Stack<>();
        Stack<String> stack2 = new Stack<>();
        Stack<String> stack3 = new Stack<>();
        while (!q.isEmpty()) {
            String s = q.remove();
            char firstChar = s.charAt(0);
            if (firstChar == 'a') {
                stack1.push(s);
            } else if (firstChar == 'b') {
                stack2.push(s);
            } else if (firstChar == 'c') {
                stack3.push(s);
            }
        }
        s2q(stack1, q);
        s2q(stack2, q);
        s2q(stack3, q);
    }
    public static void s2q(Stack<String> s, Queue<String> q) {
        while (!s.isEmpty()) {
            q.add(s.pop());
        }
    }

    public static void q2s(Queue<String> q, Stack<String> s) {
        while (!q.isEmpty()) {
            s.push(q.remove());
        }
    }
    public static void main(String[] args) {
        Queue<String>q=new LinkedList<>();
        q.add("august");
        q.add("cornelia street");
        q.add("bejeweled");
        q.add("cardigan");
        q.add("afterglow");

        System.out.println(q);
        alphabetize(q);
        System.out.println( q);
    }
}
