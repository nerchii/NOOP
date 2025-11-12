package bolji_pristup;

public interface ObserverWS<T> {
    void registerObserver (GenObserver<T> go);
    void removeObserverFromList(GenObserver<T> go);
    void notifyAllObservers();


}
