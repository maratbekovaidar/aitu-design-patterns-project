package com.company.facade;

import com.company.strategy.Cashier;
import com.company.strategy.Cook;
import com.company.strategy.Waiter;
import com.company.decorator.*;

public class OrderFacade {

    Cashier cashier = new Cashier();
    Cook cook = new Cook();
    Waiter waiter = new Waiter();

    public void executeOrder(IDoner doner){
        cashier.performWork();
        cook.performWork();
        waiter.performWork();
        System.out.println(doner.getDescription() + doner.getPrice());
    }
}
