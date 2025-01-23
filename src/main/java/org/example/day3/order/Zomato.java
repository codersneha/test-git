package org.example.day3.order;

public class Zomato implements Order{
    @Override
    public void processOrder(){
        System.out.println("Order via Zomato");
    }
    public void cancelOrder(){
        System.out.println("Order Cancelled from Zomato");
    }

}
