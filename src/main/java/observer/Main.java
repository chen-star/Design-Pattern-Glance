package observer;

/**
 * @author Alex CHEN
 * @version 1.0
 * @since 2020-08-02 17:41
 */
public class Main {

    public static void main(String[] args) {
        StockPublisher stockPublisher = new StockPublisher();

        Observer observer1 = new StockObserver(stockPublisher);
        stockPublisher.setIbmPrice(100);
        stockPublisher.setApplePrice(400);
        stockPublisher.setGooglePrice(2000);

        Observer observer2 = new StockObserver(stockPublisher);
        stockPublisher.setIbmPrice(110);
        stockPublisher.setApplePrice(440);
        stockPublisher.setGooglePrice(2230);
    }
}
