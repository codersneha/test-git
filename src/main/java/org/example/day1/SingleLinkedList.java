package org.example.day1;

public class SingleLinkedList {
    private ListNode head;

    public SingleLinkedList() {
        head = null;
    }

    public void insert(int data) {
        ListNode new_node = new ListNode(data);
        if (head == null) {
            head = new_node;
        } else {
            ListNode temp = head;

            while (temp.getNext() != null) {
                temp = temp.getNext();
            }
            temp.setNext(new_node);
        }
    }

    public void delete(int data) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        if(head.getData() == data) {
            head = head.getNext();
            return;
        }

        ListNode temp = head;
        while (temp.getNext() != null && temp.getNext().getData() != data) {
            temp = temp.getNext();
        }

        ListNode node_to_delete = temp.getNext();
        if(node_to_delete != null) {
            temp.setNext(node_to_delete.getNext());
        } else {
            temp.setNext(null);
        }

    }
    public void print() {
        ListNode temp = head;
        while (temp.getNext() != null) {
            System.out.print(temp.getData() + " -> ");
            temp = temp.getNext();
        }
        System.out.println(temp.getData());
    }

}


