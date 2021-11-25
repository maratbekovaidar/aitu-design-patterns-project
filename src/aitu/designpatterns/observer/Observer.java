package aitu.designpatterns.observer;

import aitu.designpatterns.factory.User;

import java.util.List;

public interface Observer {
    void update(List<User> users);
}
