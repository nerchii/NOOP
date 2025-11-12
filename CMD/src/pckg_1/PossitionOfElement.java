package pckg_1;

import java.util.List;

public class PossitionOfElement<E> implements CMD{

    private List<E> someList;
    private E element;

    public PossitionOfElement(List<E> someList, E element) {
        this.someList = someList;
        this.element = element;
    }

    @Override
    public void execute() {
        int pos = someList.indexOf(element);
        System.out.println("Element: " + element + " is at position: " + pos);

    }

    @Override
    public void undo() {
        System.out.println("uhhh why am i an option???");
    }

    @Override
    public void redo() {
        execute();

    }
}
