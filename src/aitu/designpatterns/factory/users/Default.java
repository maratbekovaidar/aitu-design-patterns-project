package kz.maratbekovaidar.users;

import kz.maratbekovaidar.Role;
import kz.maratbekovaidar.User;

public class Default extends User {

    Role role = Role.DEFAULT;

    public Default(String firstName, String lastName, Role role) {
        super.firstName = firstName;
        super.lastName = lastName;
        this.role = role;
    }

    @Override
    public Role getRole() {
        return this.role;
    }
}
