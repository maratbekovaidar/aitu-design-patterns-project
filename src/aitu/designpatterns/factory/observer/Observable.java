package kz.maratbekovaidar.observer;

import kz.maratbekovaidar.users.Admin;

public interface Observable {
    void registerAdmin(Admin admin);
    void unregisterAdmin(Admin admin);
    void notifyAdmins();
}
