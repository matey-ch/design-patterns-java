import java.io.IOException;

public class RandomNumberAdder {
    //цей клас створений лише для того, щоб продемонструвати роботу Singleton

    public static  void add() throws IOException {
        Reader.getInstance().write("\nRandomNumberAdder wrote this random number here: "+Math.random());
    }
}
