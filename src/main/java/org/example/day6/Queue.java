package org.example.day6;

public interface Queue {
    void enqueue(int x);
    int dequeue();
    boolean isEmpty();
    int size();
}
