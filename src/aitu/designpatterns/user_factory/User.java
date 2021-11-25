package aitu.designpatterns.user_factory;

public abstract class User {
    protected Long id;
    protected String username;
    protected String password;
    protected String name;

    protected abstract Role getGet();
}
