package no_fasada;

public class HomeTheather {
    private Amplifier amplifier;
    private Player player;
    private Lights lighhts;
    private Screen screen;
    private Projector projector;


    public HomeTheather(Amplifier amplifier, Player player, Lights lighhts, Screen screen, Projector projector){
        this.amplifier = amplifier;
        this.player = player;
        this.lighhts = lighhts;
        this.screen = screen;
        this.projector = projector;
    }
    public void turnLightsOn(){
        lighhts.on();
    }
    public void turnLightsOff(){
        lighhts.off();
    }
    public void turnProjectorOn(){
        projector.on();
    }
    public void turnProjectorOff(){
        projector.off();
    }
    public void turnOnPlayer(){
        player.turnOn();
    }
    public void turnOffPlayer(){
        player.turnOff();
    }
    public void turnOnAmp(){
        amplifier.on();
    }
    public void turnOffAmp(){
        amplifier.off();
    }
    public void pullUpScreen(){
        screen.pullUp();
    }
    public void pullDownScreen(){
        screen.pullDown();
    }

}
