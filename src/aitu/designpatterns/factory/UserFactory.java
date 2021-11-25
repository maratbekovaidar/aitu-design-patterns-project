package aitu.designpatterns.factory;

import aitu.designpatterns.observer.Observable;
import aitu.designpatterns.factory.users.Admin;
import aitu.designpatterns.factory.users.Default;

import java.util.ArrayList;
import java.util.List;

public class UserFactory implements Observable {

    List<Admin> adminUsersList = new ArrayList<>();
    List<User> defaultUsersList = new ArrayList<>();

    public User createUser(int id, String username, String password, String name, String userRole) {
        User user;
        switch (userRole) {
            case "user":
                user = new Default(id, username, password, name);
                defaultUsersList.add(user);
                notifyAdmins();
                return user;
            case "admin":
                user = new Admin(id, username, password, name);
                registerAdmin((Admin) user);
                return user;
            default:
                return null;
        }
    }

    @Override
    public void registerAdmin(Admin admin) {
        adminUsersList.add(admin);
    }

    @Override
    public void unregisterAdmin(Admin admin) {
        adminUsersList.remove(admin);
    }

    @Override
    public void notifyAdmins() {
        for (Admin admin: adminUsersList) {
            admin.update(defaultUsersList);
        }
    }

    public List<User> getDefaultUsersList() {
        return defaultUsersList;
    }
}
