package aitu.designpatterns.observer;

import aitu.designpatterns.factory.users.Admin;

public interface Observable {
    void registerAdmin(Admin admin);
    void unregisterAdmin(Admin admin);
    void notifyAdmins();
}
