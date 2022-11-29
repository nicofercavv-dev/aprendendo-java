import java.util.Scanner;

public class Casting {

    public static void main(String[] args) {
        double dd = 13.67;
        short ss = 5;
        int i = (int) dd / ss;
        System.out.println(i);

        Scanner scanner = new Scanner(System.in);
        double j = scanner.nextDouble();
    }
}
