package zad_1;

public class NovelWriter implements WriterInt {
    @Override
    public void writeNovel(int novelType) {
        switch (novelType) {
            case 1:
                System.out.println("Writing romantic novel."); break;
            case 2:
                System.out.println("Writing science fiction novel."); break;
            case 3:
                System.out.println("Writing horror novel."); break;
            default:
                throw new IllegalArgumentException("Novel type is not valid!");
        }
    }
}
