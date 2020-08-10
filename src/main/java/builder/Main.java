package builder;

/**
 * @author Alex CHEN
 * @version 1.0
 * @since 2020-08-09 23:54
 */
public class Main {
    public static void main(String[] args) {
        Director director = new Director();

        director.getBMW().show();
        director.getPorsche().show();
    }
}
