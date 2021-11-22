package com.company;

public class OrderFacade {
    Cashier cashier = new Cashier();
    Cook cook = new Cook();
    Waiter waiter = new Waiter();

    public void executeOrder(){
        cashier.doJob();
        cook.doJob();
        waiter.doJob();
    }
}
