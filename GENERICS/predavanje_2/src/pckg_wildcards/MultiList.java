//wildcards
package pckg_wildcards;
import java.util.ArrayList;
import java.util.List;

public class MultiList <E>{
    private final List<E> list;


    public MultiList(){
        this.list = new ArrayList<>();
    }

    public MultiList(List<E> list) {
        this.list = list;
    }

    public void listElements(){
        if (list.isEmpty()){
            System.out.println("Empty list");
        } else {
            list.forEach(System.out::println);

        }
    }

    public void addElToList(E element) {
        if (list.contains(element)){
            System.out.println("Element in list");
        } else {
            list.add(element);
            System.out.println("Element added");
        }
    }
    public void removeFromList(E element) {
        if (list.contains(element)){
            list.remove(element);
            System.out.println("Removed");
        } else {
            System.out.println("Element not in list");
        }
    }

    public void compareListLenght(List<?> anoterList){
        if (list.size() > anoterList.size()){
            System.out.println("First list bigger");
        } else if (list.size() < anoterList.size()) {
            System.out.println("sECOND LIST ONGER");
        } else {
            System.out.println("lenght same");
        }
    }
}
