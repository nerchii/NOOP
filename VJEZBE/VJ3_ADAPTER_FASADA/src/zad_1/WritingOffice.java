package zad_1;

public class WritingOffice {
    private WriterInt writerInt;
    private NovelWriter novelWriter;

    public WritingOffice(WriterInt writerInt) {
        this.novelWriter = new NovelWriter();
        this.writerInt = writerInt;

    }

    public void writeNovel(int novelType){
        novelWriter.writeNovel(novelType);
        System.out.println(this.toString());
    }

    public void setWriter (int novelType){
        writerInt.writeNovel(novelType);

    }


}
