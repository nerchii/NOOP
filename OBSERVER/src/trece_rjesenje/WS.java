package trece_rjesenje;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class WS implements ObserverWTS , WeatherFeed, WTHStationObserver{
    private float temperature;
    private float humidity;
    private float pressure;
    private  final List<ObserverWTS> observers;

    public WS(float temperature, float humidity, float pressure, List<ObserverWTS> observers) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;

        this.observers = new CopyOnWriteArrayList<>();
    }



    @Override
    public void updateData() {

    }

    @Override
    public void setFeedData() {

    }

    @Override
    public float getTemperature() {
        return this.temperature;

    }

    @Override
    public float getHumidity() {
        return this.humidity;

    }

    @Override
    public float getPressure() {
        return this.pressure;

    }

    @Override
    public void registerObserver(ObserverWTS observerWTS) {
        if (observers.contains(observerWTS))
            return;
        observers.add(observerWTS);

    }

    @Override
    public void unregisterObserver(ObserverWTS observerWTS) {
        if (!observers.contains(observerWTS))
            return;
        observers.remove(observerWTS);

    }

    @Override
    public void notifyAllObservers() {
        for (ObserverWTS observer : observers) {
            observer.updateData();
        }

    }
}
