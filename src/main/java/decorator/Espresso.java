package decorator;

/**
 * @author Alex CHEN
 * @version 1.0
 * @since 2020-08-16 23:49
 */
public class Espresso extends Coffee {

    @Override
    protected double getCost() {
        return 5;
    }
}
