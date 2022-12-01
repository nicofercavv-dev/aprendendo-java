import co.nicoferca.User;

public class MetodosEProps {

    public static void main(String[] args) {

        User userA = new User();
        userA.firstName = "Nico";
        userA.lastName = "Cavalcante";
        userA.setLogged(true);
        userA.fullName = userA.getFullName();

        System.out.println(userA.fullName);
    }
}
