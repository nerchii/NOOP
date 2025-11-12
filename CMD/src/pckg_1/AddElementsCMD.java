package pckg_1;

import java.util.List;

public class AddElementsCMD<E> implements CMD{

    private List<E> someList;
    private E element;

    public AddElementsCMD(List<E> someList, E element) {
        this.someList = someList;
        this.element = element;
    }


    @Override
    public void execute() {
        someList.add(element);
        System.out.println("Added element: " + element);
    }

    @Override
    public void undo() {
        someList.remove(element);
        System.out.println("Removed element: " + element);

    }

    @Override
    public void redo() {
        execute();
    }
}
