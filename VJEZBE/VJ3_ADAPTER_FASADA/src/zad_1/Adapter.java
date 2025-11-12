package zad_1;

public class Adapter implements WriterInt {

    private SFNovelist sfNovelist;

    public Adapter() {
        this.sfNovelist = new SFNovelist();
    }


    @Override
    public void writeNovel(int novelType) {
        sfNovelist.writeSFNovel();
    }

    @Override
    public String toString() {
        return "Adapter{" +
                "sfNovelist=" + sfNovelist +
                '}';
    }

    //adapt sf to writer



}
