package com.company;

public class Coffee {

    private final int price = 800;
    String coffeeName;
    String size;

    public Coffee( String coffeeName, String size) {
        this.setCoffeeName(coffeeName);
        this.setSize(size);
    }

    public String getCoffeeName() {
        return coffeeName;
    }

    public void setCoffeeName(String coffeeName) {
        this.coffeeName = coffeeName;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void make(){
        System.out.println("Making " + coffeeName + ", size " + size);
        if (this.size.equalsIgnoreCase("small")){
            System.out.println("The total price for coffee is " + this.price);
        }
        else if(this.size.equalsIgnoreCase("medium")){
            System.out.println("The total price for coffee is  " + (this.price + 200));
        }
        else if(this.size.equalsIgnoreCase("large")){
            System.out.println("The total price for coffee is " + (this.price + 300));
        }
    }
}
