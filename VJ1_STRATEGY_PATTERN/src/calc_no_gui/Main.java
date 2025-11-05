package calc_no_gui;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while(true){
            Scanner answer =  new Scanner(System.in);
            System.out.println("First number:");
            double firstNum = answer.nextDouble();
            System.out.println("Second number:");
            double secondNum = answer.nextDouble();

            System.out.printf("Choose operation: " + "\n1. multiply" +"\n2. devide" +"\n3. subtract" +"\n4. add");
            int operation = answer.nextInt();

            CalcStrategy calc = null;

            switch (operation) {
                case 1:
                    calc = new Multiplication();
                    break;
                case 2:
                    calc = new Division();
                    break;
                case 3:
                    calc = new Subtract();
                    break;
                case 4:
                    calc = new Addition();
                    break;
                default:
                    System.out.println("Invalid operation!");
                    continue;
            }
            Double result = calc.preformCalculation(firstNum, secondNum);
            System.out.println("Result: " + result);
        }
    }
}
