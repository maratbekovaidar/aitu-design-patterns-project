package kz.maratbekovaidar.observer;

import kz.maratbekovaidar.users.Default;

import java.util.List;

public interface Observer {
    void update(List<Default> defaults);
}
