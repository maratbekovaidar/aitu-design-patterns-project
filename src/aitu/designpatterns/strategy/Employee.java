package com.company.strategy;

public class Employee {
    WorkBehaviour work;

    public void performWork(){
        work.toWorkOn();
    }

    public void setWork(WorkBehaviour work) {
        this.work = work;
    }
}
