package Asim.Interface;

public class WalletService implements PaymentService, PaymentStatus {

    public void pay(double amount) {
        System.out.println("Processing wallet payment of amount: " + amount);
    }

    public void refund(double amount) {
        System.out.println("Processing wallet refund of amount: " + amount);
    }

    public void checkPaymentStatus() {
        System.out.println("Checking wallet payment status...");
    }
    
}
