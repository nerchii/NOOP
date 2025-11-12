package ZD_2;

import java.util.Stack;

public class MobileApp {

    private PaymentTransactionCMD paymentTransactionCMD;
    private Stack<PaymentTransactionCMD> undoStack;
    private Stack<PaymentTransactionCMD> redoStack;

    public MobileApp() {
        System.out.println("Create mobile app acc");
    }

    public void setPaymentTransactionCMD(PaymentTransactionCMD paymentTransactionCMD) {
        this.paymentTransactionCMD = paymentTransactionCMD;
    }

    public void performTransaction(){
        paymentTransactionCMD.execute();
        undoStack.add(paymentTransactionCMD);
    }
    public void undoTransaction(){
        if(undoStack.isEmpty()){
            System.out.println("No commands to undo");
        } else {
            paymentTransactionCMD = undoStack.pop();
            paymentTransactionCMD.undo();
            redoStack.add(paymentTransactionCMD);
        }
    }

    public void  redoTransaction(){
        if(redoStack.isEmpty()){
            System.out.println("No commands to redo");
        } else {
            paymentTransactionCMD = redoStack.pop();
            paymentTransactionCMD.redo();
            undoStack.add(paymentTransactionCMD);
        }
    }
}
