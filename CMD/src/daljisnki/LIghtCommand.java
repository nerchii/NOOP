package daljisnki;

public class LIghtCommand implements Command {
    private Light light;

    public LIghtCommand(Light light) {
        this.light = light;
    }


    @Override
    public void exicute() {
        light.on();

    }

    @Override
    public void undo() {
        light.off();

    }
}
