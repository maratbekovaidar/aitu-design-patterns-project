package aitu.designpatterns;

public class Main {
    public static void main(String[] args) {
        OrderFacade order = new OrderFacade();

        IDoner stardardDonerWithCheeseAndWithJalapeno = new CheeseDecorator(new JalapenoDecorator(new StandardDoner()));

        order.executeOrder(stardardDonerWithCheeseAndWithJalapeno);

        CoffeeOrder coffeeOrder = new CoffeeOrder();
        coffeeOrder.make();
    }
}
