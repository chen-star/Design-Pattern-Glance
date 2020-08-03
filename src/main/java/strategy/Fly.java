package strategy;

/**
 * @author Jiaxin CHEN
 * @version 1.0
 * @since 2020-08-02-16-47
 */
public interface Fly {

    void fly();
}


class CanFly implements Fly {

    public void fly() {
        System.out.println("I'm flying");
    }

}

class CannotFly implements Fly {

    public void fly() {
        System.out.println("I cannot flying");
    }

}