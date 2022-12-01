package co.nicoferca;

public class User {
    private boolean isLogged;
    public String firstName;
    public String lastName;
    public String fullName;

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public void setLogged(Boolean logged) {
        isLogged = logged;
    }
}
