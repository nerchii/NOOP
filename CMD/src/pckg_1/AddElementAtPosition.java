package pckg_1;

import java.util.List;

public class AddElementAtPosition<E> implements CMD{

    private List<E> someList;
    private int position;
    private E element;

    public AddElementAtPosition(List<E> someList, int position, E element) {
        this.someList = someList;
        this.position = position;
        this.element = element;
    }

    @Override
    public void execute() {
        someList.add(position, element);
        System.out.println("Added element: " + element + " at position: " + position);

    }

    @Override
    public void undo() {
        someList.remove(position);
        System.out.println("Removed element: " + element + " at position: " + position);

    }

    @Override
    public void redo() {
        execute();
    }
}
