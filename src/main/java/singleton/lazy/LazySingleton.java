package singleton.lazy;

/**
 * @author Alex CHEN
 * @version 1.0
 * @since 2020-08-09 23:18
 */
public class LazySingleton {

    private static LazySingleton instance = null;

    private LazySingleton() {

    }

    /**
     * 1. Single thread
     */
    public static LazySingleton getInstance1() {
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }

    /**
     * 2. With synchronized
     */
    public static synchronized LazySingleton getInstance2() {
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }

    /**
     * 3. double checked locking
     */
    public static LazySingleton getInstance3() {
        if (instance == null) {
            synchronized (LazySingleton.class) {
                if (instance == null) {
                    instance = new LazySingleton();
                }
            }
        }
        return instance;
    }
}
