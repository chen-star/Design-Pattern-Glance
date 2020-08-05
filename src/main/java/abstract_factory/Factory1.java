package abstract_factory;

/**
 * @author Alex CHEN
 * @version 1.0
 * @since 2020-08-05 00:06
 */
public class Factory1 implements Factory{

    @Override
    public Product Ipad() {
        return new Ipad();
    }

    @Override
    public Product Macbook() {
        return new Macbook();
    }
}
