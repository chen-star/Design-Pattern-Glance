package builder;

/**
 * @author Jiaxin CHEN
 * @version 1.0
 * @since 2020-08-09-23-50
 */
public interface Builder {
    void setPart(String name, String type);

    Product getProduct();
}
