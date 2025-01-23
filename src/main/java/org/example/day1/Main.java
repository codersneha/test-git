package org.example.day1;

public class Main {


    public static void main(String[] args) {
        SingleLinkedList sll = new SingleLinkedList();
        sll.insert(3);
        sll.insert(5);
        sll.insert(10);
        sll.print();
        sll.delete(5);
        sll.print();
    }
}
