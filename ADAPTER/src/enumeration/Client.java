package enumeration;

import java.util.Iterator;

public class Client<E> {

    private Iterator<E> someItem;

    public Client(Iterator<E> someItem) {
        this.someItem = someItem;
    }




    public boolean hasNext(){
        return someItem.hasNext();
    }
    public E next(){
        return someItem.next();
    }
    public void remove(){
        someItem.remove();
    }
}
