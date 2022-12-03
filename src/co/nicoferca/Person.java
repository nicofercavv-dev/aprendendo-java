package co.nicoferca;

public class Person {
    private String firstName;
    private String lastName;

    //CONSTRUTOR
    public Person(String firstName, String lastName) {
        this.firstName = firstName.toUpperCase();
        this.lastName = lastName.toUpperCase();
    }
    //SETTERS
    public void setFirstName(String firstName) {
        this.firstName = firstName.toUpperCase();
    }

    public void setLastName(String lastName) {
        this.lastName = lastName.toUpperCase();
    }

    //GETTERS
    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }
}
