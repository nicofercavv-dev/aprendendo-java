import co.nicoferca.Person;
public class Arrays {

    public static void main(String[] args) {
        Person[] pessoas = new Person[10];

        for(int i = 0; i < pessoas.length; i++) {
            Person actual = new Person("a", "b");
            actual.setFirstName("Nome " + i);
            actual.setLastName("Sobrenome " + i);
            pessoas[i] = actual;
        }

        System.out.println(pessoas[2].getFirstName());
        System.out.println(pessoas[2].getLastName());
    }
}
