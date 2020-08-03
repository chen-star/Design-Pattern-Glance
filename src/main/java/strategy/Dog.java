package strategy;

/**
 * @author Alex CHEN
 * @version 1.0
 * @since 2020-08-02 16:46
 */
public class Dog extends Animal{

    public Dog() {
        this.flyImpl = new CannotFly();
    }
}
