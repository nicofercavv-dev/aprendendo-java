import java.util.Random;

public class Loops {

    public static void main(String[] args) {
        Random generate = new Random();
        int i = 0;
        System.out.println("While:");
        while (i < 6) {
            int number = generate.nextInt(60);
            System.out.println(number);
            i++;
        }

        i = 0;

        System.out.println("For:");
        for (int j = 0; j < 6; j++) {
            int number = generate.nextInt(60);
            System.out.println(number);
        }

        System.out.println("Do-while:");
        do {
            int number = generate.nextInt(60);
            System.out.println(number);
            i++;
        } while (i < 6);
    }
}
