package decorator;

/**
 * @author Alex CHEN
 * @version 1.0
 * @since 2020-08-16 23:50
 */
public class AddMilkDecorator extends Coffee{

    Coffee coffee;

    public AddMilkDecorator(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    protected double getCost() {
        return coffee.getCost() + 1.5;
    }
}
