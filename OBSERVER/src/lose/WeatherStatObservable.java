package lose;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class WeatherStatObservable extends MobileObserver implements ObservableInt{
    private float temp;
    private float press;
    private float humid;
    private boolean isChanged;

    private final List<ObservableInt> observers;

    public WeatherStatObservable(float temp, float press, float humid) {
        this.temp = temp;
        this.press = press;
        this.humid = humid;
        this.observers = new CopyOnWriteArrayList<>();
        this.isChanged = false;

        System.out.println("Wetaher stat");
        notifyOb();
    }

    public WeatherStatObservable(List<ObservableInt> observers) {

        this.observers = observers;
    }

    public void listAllObservers(){
    }


    @Override
    public void add(ObservableInt oi) {
        if (observers.contains(oi)) {
            System.out.println("Observer already exists");
        } else {
            observers.add(oi);
            System.out.println("Observer added");

        }
    }

    @Override
    public void remove(ObservableInt observableInt) {
    }

    @Override
    public void notifyOb() {
        for(ObservableInt observer : observers){
            observer.update();
        }
    }


    public float getTemp() {
        return temp;
    }

    public float getPress() {
        return press;
    }

    public float getHumid() {
        return humid;
    }

    public void stateChanged(float temp, float press, float humid) {
        if (this.temp != temp || this.press != press || this.humid != humid) {
            this.isChanged = true;
            setStateData(temp, press, humid);
        }
    }
    public void setStateData(float temp, float press, float humid) {
        //svakih pa sata
        this.temp = temp;
        this.press = press;
        this.humid = humid;
        notifyOb();
    }

    @Override
    public void setWS() {

    }
}
