package daljisnki;

public class GaraheDoorCMD implements Command{

    private GarageDoor garaheDoor;

    public GaraheDoorCMD(GarageDoor garaheDoor) {
        this.garaheDoor = garaheDoor;
    }

    @Override
    public void exicute() {
        garaheDoor.open();

    }

    @Override
    public void undo() {
        garaheDoor.close();

    }
}
