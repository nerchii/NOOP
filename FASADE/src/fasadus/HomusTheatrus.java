package fasadus;

public class HomusTheatrus {

    private Fasada fasada;

    public HomusTheatrus (Fasada fasada){
        this.fasada = fasada;
    }

    public void watchMovie(){
        fasada.watchMovie();
    }
    public void stopMovie(){
        fasada.stopMovie();
    }
}
