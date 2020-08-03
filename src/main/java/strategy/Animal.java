package strategy;

import lombok.Getter;
import lombok.Setter;

/**
 * @author Alex CHEN
 * @version 1.0
 * @since 2020-08-02 16:45
 */
@Getter
@Setter
public abstract class Animal {

    private String name;
    private double weight;

    protected Fly flyImpl;

    public void tryToFly() {
        flyImpl.fly();
    }
}
