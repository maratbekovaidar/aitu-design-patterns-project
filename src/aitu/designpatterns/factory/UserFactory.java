package kz.maratbekovaidar;


import kz.maratbekovaidar.observer.Observable;
import kz.maratbekovaidar.users.Admin;
import kz.maratbekovaidar.users.Default;

import java.util.ArrayList;
import java.util.List;

public class UserFactory implements Observable {

    List<Admin> admins = new ArrayList<>();
    List<Default> defaults = new ArrayList<>();

    public User createUser(String firstName, String lastName, String role) {
        User user;
        switch (role) {
            case "user":
                user = new Default(firstName, lastName, Role.DEFAULT);
                defaults.add((Default) user);
                return user;
            case "admin":
                user = new Admin(firstName, lastName, Role.ADMIN);
                registerAdmin((Admin) user);
                ((Admin) user).update(defaults);
                return user;
            default:
                System.out.println("Incorrect user role! Need admin or user.");
                return null;
        }
    }

    @Override
    public void registerAdmin(Admin admin) {
        admins.add(admin);
    }

    @Override
    public void unregisterAdmin(Admin admin) {
        admins.remove(admin);
        admin.removeRole();
    }

    @Override
    public void notifyAdmins() {
        for (Admin admin: admins) {
            admin.update(defaults);
        }
    }

    public List<Default> getDefaults() {
        return defaults;
    }
}
