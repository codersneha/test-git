package org.example.day4;

public class StackArray implements Stack{
    private int[] stack;
    private int top;

    public StackArray() {
        stack = new int[100]; // Default capacity set to 100
        top = -1;
    }
    @Override
    public void push(int x) {

        stack[++top] = x;

    }
    @Override
    public int peek() {
        if (top == -1) {
            System.out.println("No element");
            return -1;
        } else{
            return stack[top];
        }
    }
    @Override
    public int pop() {
        if (isEmpty()){
            return -1;
        }
        int topElement=stack[top];
        stack[top]=0;
        top--;
        return topElement;
    }
    @Override
    public boolean isEmpty() {
        if (top==-1) {
            System.out.println("No element");
            return true;
        }
        return false;
    }
    @Override
    public int size(){
        return top+1;
    }

    @Override
    public String toString() {
        if(isEmpty())
            return "";
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[");
        for(int i=0;i<=top;i++) {
            stringBuilder.append(stack[i]);
            stringBuilder.append(",");
        }
        stringBuilder.deleteCharAt(stringBuilder.length()-1);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }



}
