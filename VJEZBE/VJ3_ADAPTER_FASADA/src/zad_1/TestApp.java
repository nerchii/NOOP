package zad_1;

public class TestApp {

    public static void main(String[] args) {

        NovelWriter writer = new NovelWriter();
        WritingOffice office = new WritingOffice(writer);

        office.writeNovel(1);





        office.setWriter(2);
    }
}
