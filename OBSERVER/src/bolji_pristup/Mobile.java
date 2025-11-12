package bolji_pristup;

public class Mobile implements GenObserver<WSReadings> {
    @Override
    public void update(WSReadings event) {
        System.out.println(event.temp());
        System.out.println(event.humidity());
        System.out.println(event.pressure());
        System.out.println(event.now());
        System.out.println("-------------------------------------------------");
    }
}
