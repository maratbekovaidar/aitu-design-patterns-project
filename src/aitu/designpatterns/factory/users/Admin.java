package aitu.designpatterns.factory.users;

import aitu.designpatterns.factory.Role;
import aitu.designpatterns.factory.User;
import aitu.designpatterns.observer.Observer;

import java.util.List;

public class Admin extends User implements Observer {

    private Role role = Role.ADMIN_ROLE;

    public Admin(int id, String username, String password, String name) {
        super();
    }

    @Override
    protected Role getGet() {
        return role;
    }

    @Override
    public void update(List<User> users) {
        for (User user: users) {
            System.out.println("Created new user " + user.getName());
        }
    }
}
