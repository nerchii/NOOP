package pckg_interface;

public class CompareTwo <T extends Comparable<T>>{
    private final T fst;
    private final T scnd;


    public CompareTwo(T fst, T scnd) {
        this.fst = fst;
        this.scnd = scnd;
    }
    public void compareTwoSm () {
        if (fst.compareTo(scnd) > 0){
            System.out.println("The first is bigger");
        } else if (fst.compareTo(scnd) < 0) {
            System.out.println("Sec is bigger");
        } else {
            System.out.println("no. :(");
        }
    }





}
