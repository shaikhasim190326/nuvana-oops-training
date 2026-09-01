package Asim.Interface;

public class UpiService implements PaymentService, PaymentStatus {

    public void pay(double amount) {
        System.out.println("Processing UPI payment of amount: " + amount);
    }

    public void refund(double amount) {
        System.out.println("Processing UPI refund of amount: " + amount);
    }

    public void checkPaymentStatus() {
        System.out.println("Checking UPI payment status...");
    }
    
}
