package calc_no_gui;

public enum ALG {

    ADDITION("Addition"),
    SUBTRACTION("Subtraction"),
    MULTIPLICATION("Multiplication"),
    DIVISION("Division");



    private String alg;

    ALG(String algOperLabel) {
        this.alg = algOperLabel;
    }


    @Override
    public String toString() {
        return super.toString();
    }
}
