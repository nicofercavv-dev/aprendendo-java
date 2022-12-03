import co.nicoferca.Person;

public class GettersAndSetters {

    public static void main(String[] args) {
        Person personA = new Person("a", "b");
        personA.setFirstName("Nico");
        personA.setLastName("Cavalcante");

        System.out.println(personA.getFirstName() + " " + personA.getLastName());
    }
}
