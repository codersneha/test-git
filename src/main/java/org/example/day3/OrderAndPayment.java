package org.example.day3;

import org.example.day3.order.Order;
import org.example.day3.payment.Payment;

public class OrderAndPayment {

    Order order;

    Payment payment;

    public OrderAndPayment (Order order, Payment payment) {
        this.order= order;
        this.payment= payment;
    }

    public void orderAndPayment () {
        order.processOrder();
        payment.processPayment();
    }

    public void cancelOrderAndRefundPayment() {
        order.cancelOrder();
        payment.refundPayment();
    }

}
