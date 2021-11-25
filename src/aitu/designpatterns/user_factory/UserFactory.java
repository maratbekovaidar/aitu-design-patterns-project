package aitu.designpatterns.user_factory;

import aitu.designpatterns.user_factory.users.Admin;
import aitu.designpatterns.user_factory.users.Default;

public class UserFactory {

    public User createUser(Long id, String username, String password, String name, String userRole) {
        switch (userRole) {
            case "user":
                return new Default(id, username, password, name);
            case "admin":
                return new Admin(id, username, password, name);
            default:
                return null;
        }
    }
}
