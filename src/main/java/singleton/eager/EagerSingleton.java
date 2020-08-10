package singleton.eager;

/**
 * @author Alex CHEN
 * @version 1.0
 * @since 2020-08-09 23:25
 */
public class EagerSingleton {

    private static final EagerSingleton instance = new EagerSingleton();

    private EagerSingleton() {

    }

    public static EagerSingleton getInstance() {
        return instance;
    }
}
