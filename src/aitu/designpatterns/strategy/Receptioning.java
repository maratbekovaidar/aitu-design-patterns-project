package com.company.strategy;

public class Receptioning implements WorkBehaviour {
    @Override
    public void toWorkOn() {
        System.out.println("Accept payment for doner");
    }
}
