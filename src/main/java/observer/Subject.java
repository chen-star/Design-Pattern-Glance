package observer;

/**
 * @author Jiaxin CHEN
 * @version 1.0
 * @since 2020-08-02-17-28
 */
public interface Subject {

    void register(Observer observer);
    void unregister(Observer observer);
    void notifyObserver();
}
