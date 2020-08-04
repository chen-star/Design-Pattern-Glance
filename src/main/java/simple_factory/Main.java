package simple_factory;

/**
 * @author Alex CHEN
 * @version 1.0
 * @since 2020-08-03 23:22
 */
public class Main {

    public static void main(String[] args) {
        ShapeFactory factory = new ShapeFactory();

        Shape shape1 = factory.getShape("circle");
        shape1.draw();
        Shape shape2 = factory.getShape("rectangle");
        shape2.draw();
    }
}
