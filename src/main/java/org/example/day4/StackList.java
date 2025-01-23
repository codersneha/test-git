package org.example.day4;

import java.util.ArrayList;
import java.util.List;

public class StackList implements Stack{
    private List<Integer> list;
    private int top;

    public StackList(){
        list=new ArrayList<>();
        top = -1;
    }
    @Override
    public void push(int x){
        list.add(x);
        top++;
    }
    @Override
    public int peek(){
        if(top == -1) {
            System.out.println("no element");
            return -1;
        } else{
            return list.get(top);
        }
    }
    @Override
    public int pop(){
        if (isEmpty()){
            return -1;
        }
        int top_element = list.remove(top);
        top--;
        return top_element;
    }
    @Override
    public boolean isEmpty() {
        if (top == -1) {
            System.out.println("no element");
            return true;
        }
        return false;
    }
    @Override
    public int size(){
        return list.size();
    }

    @Override
    public String toString() {
        if(isEmpty())
            return "";
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[");
        for(int i=0;i<=top;i++) {
            stringBuilder.append(list.get(i));
            stringBuilder.append(",");
        }
        stringBuilder.deleteCharAt(stringBuilder.length()-1);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}