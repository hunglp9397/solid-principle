package com.hunglp.interface_segregation.good;

public class WalkInCustomer implements OrderInterface, PaymentInterface{
    @Override
    public void placeOrder() {
        System.out.println("InPerson Order");
    }

    @Override
    public void pay() {
        System.out.println("InPerson Payment");
    }
}
