package com.hunglp.interface_segregation.bad;

public interface RestaurantInterface {
    void onlineOrder();

    void inPersonOrder();

    void payOnline();

    void payInPerson();
}
