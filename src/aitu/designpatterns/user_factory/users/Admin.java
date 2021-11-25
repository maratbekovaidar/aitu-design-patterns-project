package aitu.designpatterns.user_factory.users;

import aitu.designpatterns.user_factory.Role;
import aitu.designpatterns.user_factory.User;

public class Admin extends User {

    private Role role = Role.ADMIN_ROLE;

    public Admin(Long id, String username, String password, String name) {
        super();
    }

    @Override
    protected Role getGet() {
        return role;
    }
}
