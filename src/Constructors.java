import co.nicoferca.Person;
import co.nicoferca.User;

public class Constructors {

    public static void main(String[] args) {
        Person[] users = new Person[]{
                new Person("Nico", "Ferca"),
                new Person("Bel", "Ferca"),
                new Person("Silco", "Gostoso")
        };

        System.out.println(users[0].getFirstName());
        System.out.println(users[0].getLastName());
    }
}
