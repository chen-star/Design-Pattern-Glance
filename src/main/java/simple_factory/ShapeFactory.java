package simple_factory;

/**
 * @author Alex CHEN
 * @version 1.0
 * @since 2020-08-03 23:20
 */
public class ShapeFactory {

    public Shape getShape(String shapeType) {
        if (shapeType.equalsIgnoreCase("circle")) {
            return new Circle();
        } else if (shapeType.equalsIgnoreCase("rectangle")) {
            return new Rectangle();
        }

        return null;
    }
}
