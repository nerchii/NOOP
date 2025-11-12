package no_fasada;

public class App {
    public static void main(String[] args) {
        Amplifier amplifier = new Amplifier();
        Projector projector = new Projector();
        Lights lights = new Lights();
        Screen screen = new Screen();
        Player player = new Player();

        HomeTheather homeTheather = new HomeTheather(amplifier,player,lights,screen,projector);


        homeTheather.turnProjectorOn();
        homeTheather.turnOnPlayer();
        homeTheather.turnLightsOn();
        homeTheather.pullUpScreen();
        homeTheather.turnOffPlayer();
        homeTheather.turnLightsOff();
        homeTheather.turnProjectorOff();
    }
}
