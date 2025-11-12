package pckg_1;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {

        List<String> list = new ArrayList<String>();

        ListManager<String> listManager = new ListManager<>(list);
        listManager.setCommand(new AddElementsCMD<String>(list,"new"));
        listManager.exeComand();
        listManager.setCommand(new AddElementsCMD<String>(list,"new2"));
        listManager.exeComand();
        listManager.listAllElementsInList();
        listManager.setCommand(new AddElementAtPosition<String>(list,1,"new3"));
        listManager.exeComand();
        listManager.listAllElementsInList();

        listManager.undoCmd();
        listManager.listAllElementsInList();

        listManager.redoCmd();
        listManager.listAllElementsInList();

        listManager.redoCmd();

    }
}
