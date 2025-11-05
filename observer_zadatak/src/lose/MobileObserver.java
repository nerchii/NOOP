package lose;

public class MobileObserver implements ObserverInt, Display{


    private float temp;
    private float hmd;
    private float prs;
    WeatherStatObservable ws = new WeatherStatObservable(23,23,23);

    private float [] values2Display;

    public MobileObserver() {
        System.out.println("Mobile app.");
//        this.temp = temp;
//        this.hmd = hmd;
//        this.prs = prs;
    }

    @Override
    public void update() {

//        this.temp = (float) ws.getTemp();
//        this.prs = ws.getPress();
//        this.hmd = ws.getHumid();
//        System.out.println("temp = " + temp);
//        System.out.println("hmd = " + hmd);
//        System.out.println("prs = " + prs);
    }

    @Override
    public void register(ObservableInt observable) {
    }

    @Override
    public void unregister(ObservableInt observable) {

    }

    @Override
    public void setWS() {
        setWs(ws);
    }

    public void setWs(WeatherStatObservable ws) {
        this.ws = ws;
    }

    @Override
    public void display() {

    }


    private void set(WeatherStatObservable wso) {
    }
}
