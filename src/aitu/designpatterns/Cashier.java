package com.company;

public class Cashier implements IJob{
    @Override
    public void doJob() {
        System.out.println("accept payment for doner");
    }
}
