import co.nicoferca.Guitar;

public class IntroJavaOO {

    public static void main(String[] args) {
        Guitar fender =  new Guitar();
        fender.name = "Fender";
        fender.strings = 6;

        Guitar ibanez = new Guitar();
        ibanez.name = "Ibanez";
        ibanez.strings = 6;

        fender.play();
    }
}
