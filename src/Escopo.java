public class Escopo {
    int x = 5;
    public void nico(String a) {
        System.out.println(x);
    }
    static public void main(String[] args) {
        int x = 1;
        if(true) {
            System.out.println(x);
        }

    }
}
