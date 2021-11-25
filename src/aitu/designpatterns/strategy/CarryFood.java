package com.company.strategy;

public class CarryFood implements WorkBehaviour {
    @Override
    public void toWorkOn() {
        System.out.println("Take a doner to a client");
    }
}
