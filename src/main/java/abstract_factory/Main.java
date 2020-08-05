package abstract_factory;

/**
 * @author Alex CHEN
 * @version 1.0
 * @since 2020-08-05 00:09
 */
public class Main {

    public static void main(String[] args) {
        Factory factory1 = new Factory1();
        Factory factory2 = new Factory2();

        factory1.Ipad().show();
        factory1.Macbook().show();
        factory2.Ipad().show();
        factory2.Macbook().show();
    }
}
