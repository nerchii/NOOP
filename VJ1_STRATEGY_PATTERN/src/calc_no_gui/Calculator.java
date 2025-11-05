package calc_no_gui;

import java.util.Scanner;

public class Calculator {
    private double first;
    private double second;
    private ALG operation;

    public Calculator(double first, double second, ALG operation) {
        this.first = first;
        this.second = second;
        this.operation = operation;
    }

    private int chooseOPeration(){
        Scanner sc = new Scanner(System.in);
        String option = sc.nextLine();
        switch (option){
            case "multiply": return 1;
            case "devide": return 2;
            case "subtract": return 3;
            case "add": return 4;
            default: return -1;
        }
    }


}
