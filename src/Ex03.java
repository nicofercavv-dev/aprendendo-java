public class Ex03 {

    public static void main(String[] args) {
        double x = Double.parseDouble(args[1]);
        double y = Double.parseDouble(args[2]);
        if (args[0].equals("soma")) {
            soma(x, y);
        } else if (args[0].equals("subtrai")) {
            subtrai(x, y);
        } else if (args[0].equals("multiplica")) {
            multiplica(x, y);
        } else if (args[0].equals("divide")) {
            divide(x, y);
        }
    }

    static void soma(double x, double y) {
        System.out.println(x + y);
    }
    static void subtrai(double x, double y) {
        System.out.println(x - y);
    }

    static void multiplica(double x, double y) {
        System.out.println(x * y);
    }

    static void divide(double x, double y) {
        System.out.println(x / y);
    }
}