package com.hunglp.dependency_inversion.good;

import com.hunglp.dependency_inversion.good.Child;

public class Parent {
    Child child;

    Parent(Child child){
        this.child = child;
    }

    public static void main(String[] args) {
       Child_1_Impl child1 = new Child_1_Impl();

       Parent parent = new Parent(child1);
       parent.child.foo();


    }

}
