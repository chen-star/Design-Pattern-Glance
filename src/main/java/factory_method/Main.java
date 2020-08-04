package factory_method;


/**
 * @author Alex CHEN
 * @version 1.0
 * @since 2020-08-03 23:41
 */
public class Main {

    public static void main(String[] args) {
        Factory circleFactory = new CircleFactory();
        Factory recFactory = new RectangleFactory();

        Shape circle = circleFactory.getShape();
        Shape rectangle = recFactory.getShape();
        circle.draw();
        rectangle.draw();
    }
}
