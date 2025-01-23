package org.example.day3.payment;

public class UPI implements Payment{
    @Override
    public void processPayment(){
        System.out.println("Payment via UPI");
    }

    public void refundPayment(){
        System.out.println("Payment refunded ");
    }
}
