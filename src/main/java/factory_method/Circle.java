package factory_method;

/**
 * @author Alex CHEN
 * @version 1.0
 * @since 2020-08-03 23:19
 */
public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Circle is drawing");
    }
}
