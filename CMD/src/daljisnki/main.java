package daljisnki;

public class main {
    public static void main(String[] args) {
        Remote remote = new Remote();

        GarageDoor garageDoor = new GarageDoor();
        Light light = new Light();

        remote.setComand(new GaraheDoorCMD(garageDoor));
        remote.pressButton();
        remote.pressButton();

        remote.setComand(new LIghtCommand(light));
        remote.pressButton();
        remote.pressButton();

    }
}
