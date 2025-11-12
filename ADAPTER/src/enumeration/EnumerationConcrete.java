package enumeration;

import java.util.Enumeration;

public class EnumerationConcrete<E> implements Enumeration<E> {
    @Override
    public boolean hasMoreElements() {
        return false;
    }

    @Override
    public E nextElement() {
        return null;
    }
}
