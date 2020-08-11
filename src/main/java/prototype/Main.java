package prototype;

/**
 * @author Alex CHEN
 * @version 1.0
 * @since 2020-08-10 22:54
 */
public class Main {

    public static void main(String[] args) {
        Tree original = new PineTree(10);
        Tree copied = original.copy();
        System.out.println(copied.height == original.height);
        System.out.println(copied == original);
    }
}
