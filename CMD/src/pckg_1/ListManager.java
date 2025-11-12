package pckg_1;

import java.util.List;
import java.util.Stack;

public class ListManager<E> {

    private List<E> someList;
    private CMD command;
    private final Stack<CMD> undoStack;
    private final Stack<CMD> redoStack;

    public ListManager(List<E> someList) {
        this.someList = someList;
        this.undoStack = new Stack<>();
        this.redoStack = new Stack<>();
    }
    public void exeComand(){
        command.execute();
        undoStack.add(command);

    }

    public void undoCmd(){
        if(undoStack.isEmpty()){
            System.out.println("No commands to undo");
        } else {
            command = undoStack.pop();
            command.undo();
            listStackEleements((Stack<E>) undoStack);
            redoStack.add(command);
        }
    }
    public void redoCmd(){
        if(redoStack.isEmpty()){
            System.out.println("No commands to redo");
        } else {
            command = redoStack.pop();
            command.redo();
            listStackEleements((Stack<E>) redoStack);
            undoStack.add(command);
        }
    }

    private void listStackEleements(Stack<E> stack){
        System.out.println("=======================================");
        for (E el : stack) {
            System.out.println(el);
        }
        System.out.println("=======================================");
    }

    public void setCommand(CMD command){
        this.command = command;
    }
    public void listAllElementsInList(){
        System.out.println("List elements:");
        for (E el : someList) {
            System.out.println(el);
        }
    }


}
