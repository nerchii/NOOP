package pckg_interface;

public class StrLenght<T extends Comparable<T>> extends CompareTwo<T> {

    private final String initString;

    public StrLenght(T fst, T scnd, String initString) {
        super(fst, scnd);
        this.initString = initString;
    }

    @Override
    public void compareTwoSm() {
//        return this.
    }
}
