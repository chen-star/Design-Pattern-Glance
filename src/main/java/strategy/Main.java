package strategy;

/**
 * @author Alex CHEN
 * @version 1.0
 * @since 2020-08-02 16:56
 */
public class Main {

    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal bird = new Bird();

        dog.tryToFly();
        bird.tryToFly();
    }
}
