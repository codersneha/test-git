package org.example.day2;

public class EmployeeStore {
    private ListNode head;

    public EmployeeStore() {
        head = null;
    }

    public void insert(Employee data) {
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

    public void delete(int empId) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        if(head.getData().getEmpId() == empId) {
            head = head.getNext();
            return;
        }
        ListNode temp = head;
        while (temp.getNext() != null && temp.getNext().getData().getEmpId() != empId) {
            temp = temp.getNext();
        }
        ListNode node_to_delete = temp.getNext();
        if(node_to_delete != null) {
            temp.setNext(node_to_delete.getNext());
        } else {
            temp.setNext(null);
        }

    }

    public void print_by_id(int empId) {
        ListNode temp = head;
        while (temp != null && temp.getData().getEmpId() != empId) {
            temp = temp.getNext();
        }
        if(temp != null) {
            System.out.println(temp.getData());
        } else {
            System.out.println(empId+" not found");
        }
    }

    public void print() {
        ListNode temp = head;
        while (temp != null) {
            System.out.println(temp.getData());
            temp = temp.getNext();
        }
    }
}
