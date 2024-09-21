package com.hunglp.dependency_inversion.bad;

public class Parent {
    Child child;

    Parent(Child child){
        this.child = child;
    }
}
