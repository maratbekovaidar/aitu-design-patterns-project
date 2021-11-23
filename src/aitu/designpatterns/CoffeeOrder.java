package com.company;

import java.util.Scanner;

public class CoffeeOrder {
    CoffeeAdapter coffeeAdapter;
    Coffee coffee;
    public void make(){
        Scanner in = new Scanner(System.in);
        System.out.println("Choose the coffee");
        String type = in.nextLine();
        System.out.println("Choose the size");
        String size = in.nextLine();
        coffee = new Coffee(type,size);
        coffeeAdapter = new CoffeeAdapter(coffee);
        coffeeAdapter.makeCoffee();
    }
}
