package calc_no_gui;

public class Subtract implements CalcStrategy {
    @Override
    public Double preformCalculation(double first, double second) {
        return first - second;
    }
}
