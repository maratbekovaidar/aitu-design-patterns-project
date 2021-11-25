package com.company.strategy;

public class Cooking implements WorkBehaviour {
    @Override
    public void toWorkOn() {
        System.out.println("Cook doner");
    }
}
