package observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Alex CHEN
 * @version 1.0
 * @since 2020-08-02 17:30
 */
public class StockPublisher implements Subject{

    private List<Observer> observers;
    private double ibmPrice;
    private double applePrice;
    private double googlePrice;

    public StockPublisher() {
        this.observers = new ArrayList<>();
    }

    public void register(Observer observer) {
        observers.add(observer);
    }

    public void unregister(Observer observer) {
        int idx = observers.indexOf(observer);
        observers.remove(idx);
    }

    public void notifyObserver() {
        observers.forEach(observer -> observer.onUpdate(ibmPrice, applePrice, googlePrice));
    }

    public void setIbmPrice(double ibmPrice) {
        this.ibmPrice = ibmPrice;
        notifyObserver();
    }

    public void setApplePrice(double applePrice) {
        this.applePrice = applePrice;
        notifyObserver();
    }

    public void setGooglePrice(double googlePrice) {
        this.googlePrice = googlePrice;
        notifyObserver();
    }
}
