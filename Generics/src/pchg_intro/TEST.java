package pchg_intro;

import java.util.*;

public class TEST {
    public static void main(String[] args) {
        ArrayList lista = new ArrayList<>();
        lista.add(345);
        lista.add("some string");
        lista.add(34.56);

//        Pacage user = new Pacage<>();

//        System.out.println(lista);

//        pritElements(lista);
        pritElements(lista);

    }
    public static void preformSomrthing(){
        System.out.println("something preformed");
    }





    public static void pritElements(List list){
        for (Object el: list){
            System.out.println(el);
        }
    }
//    public static void itterateList(List list){
//        Iterator iterator = list.iterator();
//        while (iterator.hasNext()){
//            Object elem = iterator.next();
//            System.out.println(elem);
//        }
//    }
    public static <E> void prinElems(ArrayList<E> list){
        for (E el : list) {
            System.out.println(el);
        }
    }

    private static <K,V> void listHashMap (Map<K,V> map) {
        for (K key : map.keySet()) {
            System.out.println("Key: " + key);
            System.out.println("Val: " + map.get(key));

        }
    }


}
