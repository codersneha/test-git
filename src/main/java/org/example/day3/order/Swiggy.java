package org.example.day3.order;

public class Swiggy implements Order{

    @Override
    public void processOrder(){
        System.out.println("Order via Swiggy");
    }

    public void cancelOrder(){
        System.out.println("Order Cancelled from Swiggy");
    }

}
