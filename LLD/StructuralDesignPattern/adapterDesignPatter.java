/* used to define structure to the entire aplication and divide them into separate components and define how the different objects would communicate
 * with one another so as to reduce coupling, make the code more modular, flexible, readable, maintainable and clean 
 * adapter design pattern acts as a universal transalator connecting the unconnectable suppose
 * we want to connect fan, music machine, fridge to internet
 */
package StructuralDesignPattern;

interface PaymentProcessor {
    public void processPayment(double amount, String currency);

    public boolean isPaymentSuccessfull();

    public double getTransactionId();
}

class InHousePaymentProcessor implements PaymentProcessor {

    public double transactionId;
    public boolean isPaymentSuccessfull;

    InHousePaymentProcessor() {

    }

    @Override
    public void processPayment(double amount, String currency) {
        this.transactionId = (double) Math.random();
        this.isPaymentSuccessfull = true;
    }

    public boolean isPaymentSuccessfull() {
        return this.isPaymentSuccessfull;
    }

    public double getTransactionId() {
        return this.transactionId;
    }
}

public class adapterDesignPatter {

}
