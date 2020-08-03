package observer;

import lombok.extern.slf4j.Slf4j;

/**
 * @author Alex CHEN
 * @version 1.0
 * @since 2020-08-02 17:34
 */
@Slf4j
public class StockObserver implements Observer{

    private static int observerCounter = 0;
    private int observerId;

    private double ibmPrice;
    private double applePrice;
    private double googlePrice;

    private Subject stockPublisher;

    public StockObserver(Subject stockPublisher) {
        this.observerId = observerCounter++;
        this.stockPublisher = stockPublisher;
        stockPublisher.register(this);
    }

    @Override
    public void onUpdate(double ibmPrice, double applePrice, double googlePrice) {
        this.ibmPrice = ibmPrice;
        this.applePrice = applePrice;
        this.googlePrice = googlePrice;

        printPrices();
    }

    private void printPrices() {
        log.info("StockObserver[{}]: ibm:[{}], apple:[{}], google:[{}]", observerId, ibmPrice, applePrice, googlePrice);
    }
}
