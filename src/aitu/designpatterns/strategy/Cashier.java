package com.company.strategy;

public class Cashier extends Employee{
    public Cashier(){
        work = new Receptioning();
    }
}
