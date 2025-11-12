package calc_no_gui;

public class Multiplication implements CalcStrategy {
    @Override
    public Double preformCalculation(double first, double second) {
        return first * second;
    }
}
