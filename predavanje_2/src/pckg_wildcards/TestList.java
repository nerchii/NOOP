package pckg_wildcards;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestList {
    public static void main(String[] args) {
        String someStr = "Stringic S PAR rijeci da";
        String[] partsOfString = someStr.split(" ");
        List<String> listrString= new ArrayList<>(Arrays.asList(partsOfString));

        MultiList<String> stringMultiList = new MultiList<>(listrString);


        Integer[] ints = {23,43,12,65,35,32,65, -23,12,-12312,34,1,23,54,7};
        List<Integer> integerMultiList  =new ArrayList<>(Arrays.asList(ints));

        stringMultiList.compareListLenght(integerMultiList);
        stringMultiList.addElToList("Novi elementus");
        stringMultiList.listElements();
    }
}
