package singleton.eager;

/**
 * @author Alex CHEN
 * @version 1.0
 * @since 2020-08-09 23:27
 */
public enum EnumSingleton {

    INSTANCE;

    private EnumSingleton() {

    }

    public static void doSomething() {
        System.out.println("I'm doing something");
    }
}
