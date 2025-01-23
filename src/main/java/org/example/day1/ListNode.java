package org.example.day1;

public class ListNode {


    //implementation details or data is private or abstracted
    private int data;
    private ListNode next;


    //Operations or methods are public
    public ListNode(int data) {
        this.data = data;
        this.next = null;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public ListNode getNext() {
        return next;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }
}
