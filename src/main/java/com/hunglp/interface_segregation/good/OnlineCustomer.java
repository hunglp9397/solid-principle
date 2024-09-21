package com.hunglp.interface_segregation.good;

public class OnlineCustomer implements OrderInterface, PaymentInterface{

    @Override
    public void placeOrder() {
        System.out.println("Place Order Online");
    }

    @Override
    public void pay() {
        System.out.println("Pay online");
    }
}
