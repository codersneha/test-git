package org.example.day3.payment;

public class Cash implements Payment{
    @Override
    public void processPayment(){
        System.out.println("Payment via Cash");
    }

    public void refundPayment(){
        System.out.println("Payment refunded ");
    }
}
