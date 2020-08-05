package abstract_factory;

/**
 * @author Alex CHEN
 * @version 1.0
 * @since 2020-08-05 00:06
 */
public class Factory2 implements Factory{

    @Override
    public Product Ipad() {
        return new IpadPro();
    }

    @Override
    public Product Macbook() {
        return new MacbookPro();
    }
}
