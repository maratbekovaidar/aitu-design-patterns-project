package com.company.adapter;

import java.util.Scanner;

public class CoffeeOrder {
    CoffeeAdapter coffeeAdapter;
    Coffee coffee;
    public void make(){
        Scanner in = new Scanner(System.in);
        System.out.println("Choose the coffee");
        System.out.println("1.Latte" +
                " 2.Cappuccino" +
                " 3.Americano");
        String type = in.nextLine();
        System.out.println("Choose the size");
        System.out.println("1.Small" +
                " 2.Medium" +
                " 3.Large");
        String size = in.nextLine();
        if(type.equalsIgnoreCase("Latte") || type.equalsIgnoreCase("Cappuccino") || type.equalsIgnoreCase("Americano")){
            coffee = new Coffee(type, size);
            coffeeAdapter = new CoffeeAdapter(coffee);
            coffeeAdapter.makeCoffee();
        }
        else {
            System.out.println("Sorry we do not have such coffee");
            make();
        }
    }
}
