package trece_rjesenje;

public class MobileFeed implements ObserverWTS{
    private WeatherFeed weatherFeed;
    public void setFeedData(WeatherFeed feedData) {
        this.weatherFeed = feedData;
    }

    @Override
    public void updateData() {
        System.out.println("MOBILE FEED DATA" + this);
        System.out.println("Temp" + this.weatherFeed.getTemperature());
        System.out.println("Humidity" + this.weatherFeed.getHumidity());
        System.out.println("Pressure" + this.weatherFeed.getPressure());

        System.out.println("==============================================");

    }

    @Override
    public void setFeedData() {

    }
}
