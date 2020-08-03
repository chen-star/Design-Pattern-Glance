package strategy;

/**
 * @author Alex CHEN
 * @version 1.0
 * @since 2020-08-02 16:47
 */
public class Bird extends Animal {

    public Bird() {
        this.flyImpl = new CanFly();
    }
}
