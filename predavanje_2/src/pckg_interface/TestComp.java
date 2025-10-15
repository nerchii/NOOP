package pckg_interface;

public class TestComp {
    public static void main(String[] args) {

        String fst = "Neki string";
        String scnd = "Drugi string";

        int fstt = 4;
        int scndd = 4;


        CompareTwo<String> compareStr = new CompareTwo<>(fst,scnd);
        CompareTwo<Integer> compInt = new CompareTwo<Integer>(fstt,scndd);

        compareStr.compareTwoSm();
        compInt.compareTwoSm();
    }

}
