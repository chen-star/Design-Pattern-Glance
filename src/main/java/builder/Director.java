package builder;

/**
 * @author Alex CHEN
 * @version 1.0
 * @since 2020-08-09 23:52
 */
public class Director {
    private Builder builder = new ConcreteBuilder();

    public Product getBMW() {
        builder.setPart("BMW", "M4");
        return builder.getProduct();
    }

    public Product getPorsche() {
        builder.setPart("Porsche", "911");
        return builder.getProduct();
    }
}
