package aitu.designpatterns.factory.users;

import aitu.designpatterns.factory.Role;
import aitu.designpatterns.factory.User;

public class Default extends User {

    private Role role = Role.USER_ROLE;

    public Default(int id, String username, String password, String name) {
        super();
    }

    @Override
    protected Role getGet() {
        return role;
    }
}
