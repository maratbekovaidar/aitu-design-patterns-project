package kz.maratbekovaidar;

import kz.maratbekovaidar.users.Admin;

public class Main {
    public static void main(String[] args) {
        UserFactory userFactory = new UserFactory();
        User user1 = userFactory.createUser("Aidar1", "Maratbekov", "user");
        User user2 = userFactory.createUser("Aidar2", "Maratbekov", "user");
        Admin admin = (Admin) userFactory.createUser("Aidar", "Maratbekov", "admin");

//        admin.update(userFactory.defaults);

    }
}
