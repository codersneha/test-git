package org.example.day3.order;

public class UberEats implements Order{
    @Override
    public void processOrder(){
        System.out.println("Order via UberEats");
    }

    public void cancelOrder(){
        System.out.println("Order Cancelled from UberEats");
    }
}
