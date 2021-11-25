package kz.maratbekovaidar.users;

import kz.maratbekovaidar.Role;
import kz.maratbekovaidar.User;
import kz.maratbekovaidar.observer.Observer;

import java.util.List;

public class Admin extends User implements Observer {

    Role role = Role.ADMIN;

    public Admin(String firstName, String lastName, Role role) {
        super.firstName = firstName;
        super.lastName = lastName;
        this.role = role;
    }

    @Override
    public Role getRole() {
        return this.role;
    }

    @Override
    public void update(List<Default> defaults) {
        System.out.println("User list:");
        for (Default user: defaults) {
            System.out.println(user.firstName + " " + user.lastName);
        }
    }

    public void removeRole() {
        this.role = Role.DEFAULT;
    }
}
