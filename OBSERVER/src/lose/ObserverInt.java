package lose;

public interface ObserverInt {
    void update();
    void register(ObservableInt observable);
    void unregister(ObservableInt observable);
    void setWS();
}
