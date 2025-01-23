package org.example.day4;

public class Main {
    public static void main(String[] args){
        Stack stack1 = new StackList(); // Here you have declared it as a Stack which is the iterface means the abstraction
        StackList stackList = new StackList(); // this is tight coupling
        stack1.push(1);
        stack1.push(2);
        stack1.push(3);
        //[1, 2, 3]
        Stack stack2 = new StackArray();
        stack2.push(1);
        stack2.push(2);
        stack2.push(3);
        System.out.println(stack2);
        System.out.println(stack1);
        System.out.println(stack1.peek());
        stack1.pop();
        stack1.pop();
        stack1.pop();
        stack1.pop();
        stack1.isEmpty();
        stack1.push(4);
        stack1.isEmpty();
        System.out.println(stack2);
        System.out.println(stack1);
        reverseStack(stack1);
        reverseStack(stack2);
        reverseStack(stackList);
    }
    //the intention here is to reverse any stack
    // now a stack can be either StackList or StackArray
    public static void reverseStack(Stack stack) {

    }

}
