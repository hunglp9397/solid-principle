package com.hunglp.interface_segregation.bad;

public class OnlineCustomer implements RestaurantInterface{
    @Override
    public void onlineOrder() {

    }

    @Override
    public void inPersonOrder() {
        // NOT SUPPORT
    }

    @Override
    public void payOnline() {

    }

    @Override
    public void payInPerson() {
        // NOT SUPPORT
    }
}
