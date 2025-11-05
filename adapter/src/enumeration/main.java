package enumeration;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class main {
    public static void main(String[] args) {

        String [] someSting = {"jdf","23","GWYGEYW"};
        List<String> list = Arrays.asList(someSting);
        Iterator<String> it = list.iterator();
        Client<String> client = new Client<>(it);
        System.out.println(client.hasNext());
        System.out.println(client.next());
        EnumerationConcrete<String> enumerationConcrete = new EnumerationConcrete<>();
        EnumerationIterator<String> enumerationIterator = new EnumerationIterator<>(enumerationConcrete);
        Client<String> client1 = new Client<>(enumerationIterator);
        System.out.println(client1.hasNext());
        System.out.println(client1.next());
        enumerationIterator.remove();
    }
}
