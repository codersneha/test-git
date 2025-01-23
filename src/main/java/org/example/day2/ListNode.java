package org.example.day2;

import java.util.List;

public class ListNode {
    private Employee data;
    private ListNode next;

    public ListNode(Employee data) {
        this.data = data;
        this.next=null;
    }

    public Employee getData() {
        return data;
    }

    public ListNode getNext() {
        return next;
    }

    public void setNext(ListNode next){
        this.next=next;
    }
}
