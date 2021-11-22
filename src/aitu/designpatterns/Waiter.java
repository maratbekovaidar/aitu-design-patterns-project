package com.company;

public class Waiter implements IJob{
    @Override
    public void doJob() {
        System.out.println("take a doner to a client");
    }
}
