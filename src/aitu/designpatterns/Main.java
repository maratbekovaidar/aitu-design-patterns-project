package aitu.designpatterns;

import aitu.designpatterns.factory.User;
import aitu.designpatterns.factory.UserFactory;
import aitu.designpatterns.factory.users.Admin;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world");
        UserFactory userFactory = new UserFactory();
        Admin admin = (Admin) userFactory.createUser(1, "maratbekovaidar", "11qwerty", "Aidar", "admin");
        User azamat = userFactory.createUser(1, "aza228", "11qwerty", "Azamat", "user");
        User diar = userFactory.createUser(1, "diyar_potrshytel", "11qwerty", "Diar", "user");
//        admin.update(userFactory.getDefaultUsersList());
    }
}
