package org.example.day3;

import org.example.day3.order.Order;
import org.example.day3.order.Swiggy;
import org.example.day3.payment.Cash;
import org.example.day3.payment.Payment;

public class Main {

    public static void main (String[] args){
        Order order = new Swiggy();
        Payment payment = new Cash();
        OrderAndPayment orderAndPayment = new OrderAndPayment(order,payment);
        orderAndPayment.orderAndPayment();
        orderAndPayment.cancelOrderAndRefundPayment();

    }
}
