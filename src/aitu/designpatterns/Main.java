package aitu.designpatterns;

public class Main {
    public static void main(String[] args) {
        UserFactory userFactory = new UserFactory();
        User user1 = userFactory.createUser("Aidar1", "Maratbekov", "user");
        User user2 = userFactory.createUser("Aidar2", "Maratbekov", "user");
        Admin admin = (Admin) userFactory.createUser("Aidar", "Maratbekov", "admin");

//        admin.update(userFactory.defaults);
        
        OrderFacade order = new OrderFacade();

        IDoner stardardDonerWithCheeseAndWithJalapeno = new CheeseDecorator(new JalapenoDecorator(new StandardDoner()));

        order.executeOrder(stardardDonerWithCheeseAndWithJalapeno);

        CoffeeOrder coffeeOrder = new CoffeeOrder();
        coffeeOrder.make();
    }
}
