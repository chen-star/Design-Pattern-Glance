package builder;

import lombok.Setter;

/**
 * @author Alex CHEN
 * @version 1.0
 * @since 2020-08-09 23:49
 */
@Setter
public class Product {

    private String name;
    private String type;

    public void show() {
        System.out.println("Name: " + name + " Type: " + type);
    }
}
