package factory_method;

/**
 * @author Alex CHEN
 * @version 1.0
 * @since 2020-08-03 23:38
 */
public class RectangleFactory implements Factory{

    @Override
    public Shape getShape() {
        return new Rectangle();
    }
}
