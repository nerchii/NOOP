package bolji_pristup;

import java.time.Instant;
import java.util.List;
import java.util.Observer;
import java.util.concurrent.CopyOnWriteArrayList;

public class WeatherStationUpdated implements ObserverWS<WSReadings>{

    private final List<GenObserver<WSReadings>> observers;
    private WSReadings wsr;

    public WeatherStationUpdated(float temp, float humidity, float pressure) {
        this.wsr = new WSReadings(temp, humidity, pressure, Instant.now());
        this.observers = new CopyOnWriteArrayList<>();
    }

    @Override
    public void registerObserver(GenObserver<WSReadings> go) {
        if (this.observers.contains(go)) {
            System.out.println("observer already registered");
        } else {
            this.observers.add(go);
            System.out.println("observer registered");}

    }

    public void setDataFromSensors(float temp, float humidity, float pressure) {
        this.wsr = new WSReadings(temp, humidity, pressure, Instant.now());
    }

    @Override
    public void removeObserverFromList(GenObserver<WSReadings> go) {

    }

    @Override
    public void notifyAllObservers() {
        for (GenObserver<WSReadings> observer : observers) {
            observer.update(wsr);

        }

    }
}
