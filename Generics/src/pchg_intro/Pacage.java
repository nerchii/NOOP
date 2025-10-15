package pchg_intro;

import java.util.ArrayList;
import java.util.Set;

public class Pacage<E> {

    private int id;
    private String name;
    private ArrayList<E> llist;

    public Pacage(int id, String name) {
        this.id = id;
        this.name = name;
        this.llist = new ArrayList<>();
    }

    public Pacage(int id, String name, ArrayList<E> llist) {
        this.id = id;
        this.name = name;
        this.llist = llist;
    }

    public void infro(Set<String> sset){
        System.out.println(sset);
    }
    public void infoo(Set<Integer> iset){
        System.out.println(iset);
    }
}
