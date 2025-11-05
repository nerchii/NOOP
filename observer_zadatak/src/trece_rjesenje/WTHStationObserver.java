package trece_rjesenje;

public interface WTHStationObserver {

    void registerObserver(ObserverWTS observerWTS);
    void unregisterObserver(ObserverWTS observerWTS);
    void notifyAllObservers();
}
