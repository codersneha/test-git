package org.example.day3.payment;

public class Card implements Payment{
    @Override
    public void processPayment(){
        System.out.println("Payment via Card");
    }

    public void refundPayment(){
        System.out.println("Payment refunded");
    }
}
