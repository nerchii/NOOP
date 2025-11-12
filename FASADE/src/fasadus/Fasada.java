package fasadus;

public class Fasada {
    private Amplifier amplifier;
    private Projector projector;
    private Lights lighhts;
    private Screen screen;
    private Player player;

    public Fasada(Amplifier amplifier, Projector projector, Lights lighhts, Screen screen, Player player){
        this.amplifier = amplifier;
        this.projector = projector;
        this.lighhts = lighhts;
        this.screen = screen;
        this.player = player;
    }


    public void watchMovie(){
        amplifier.on();
        player.turnOn();
        screen.pullDown();
        lighhts.off();
    }

    public void stopMovie(){
        amplifier.off();
        player.turnOff();
        screen.pullUp();
        lighhts.on();
    }

    public void pauseMovuie(){
        player.pause();
    }
}
