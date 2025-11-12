package calc_no_gui;

public class Division implements CalcStrategy {
    @Override
    public Double preformCalculation(double first, double second) {
        if (second == 0) {
            System.out.println("Division wih 0 doesnt work");
        } else {
            return first/second;
        }return null;
}}
