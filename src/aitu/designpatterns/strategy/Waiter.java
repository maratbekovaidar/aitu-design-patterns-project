package com.company.strategy;

public class Waiter extends Employee{
    public Waiter(){
        work = new CarryFood();
    }
}
