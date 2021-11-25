package aitu.designpatterns.factory;

public abstract class User {
    protected int id;
    protected String username;
    protected String password;
    protected String name;

    protected abstract Role getGet();

    // Getters
    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }
}
