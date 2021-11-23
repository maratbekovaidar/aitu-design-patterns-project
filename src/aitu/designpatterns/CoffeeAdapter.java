package com.company;

public class CoffeeAdapter implements CoffeeMachine {
    Coffee coffee;
    public CoffeeAdapter(Coffee coffee) {
        this.setCoffee(coffee);
    }
    public Coffee getCoffee() {
        return coffee;
    }

    public void setCoffee(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public void makeCoffee() {
        this.coffee.make();
    }
}
