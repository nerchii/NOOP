package bolji_pristup;

public class APP {
    public static void main(String[] args) {
        WeatherStationUpdated wsu = new WeatherStationUpdated(23,12,2122);
        Mobile mobile1 = new Mobile();
        Mobile mobile2 = new Mobile();

        wsu.registerObserver(mobile1);
        wsu.registerObserver(mobile2);

        wsu.notifyAllObservers();


    }
}
