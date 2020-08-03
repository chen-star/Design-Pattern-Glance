package observer;

/**
 * @author Alex CHEN
 * @version 1.0
 * @since 2020-08-02 17:29
 */
public interface Observer {

    void onUpdate(double ibmPrice, double applePrice, double googlePrice);
}
