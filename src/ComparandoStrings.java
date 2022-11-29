import java.util.Scanner;

public class ComparandoStrings {

    public static void main(String[] args) {
        String password = "123456";
        System.out.println("Digite sua senha: ");
        Scanner scanner = new Scanner(System.in);
        String pass = scanner.nextLine();
        System.out.println(pass.equals(password)); // sempre use equals para comparar strings

        // == nao compara conteudo, compara referencia dos objetos
        System.out.println(password == pass);
    }
}
