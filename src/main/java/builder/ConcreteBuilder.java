package builder;

/**
 * @author Alex CHEN
 * @version 1.0
 * @since 2020-08-09 23:51
 */
public class ConcreteBuilder implements Builder{

    private Product product = new Product();

    @Override
    public void setPart(String name, String type) {
        product.setName(name);
        product.setType(type);
    }

    @Override
    public Product getProduct() {
        return product;
    }
}
