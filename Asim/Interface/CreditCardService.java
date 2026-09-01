package Asim.Interface;

public class CreditCardService implements PaymentService, PaymentStatus {

    public void pay(double amount) {
        System.out.println("Processing credit card payment of amount: " + amount);
    }

    public void refund(double amount) {
        System.out.println("Processing credit card refund of amount: " + amount);
    }

    public void checkPaymentStatus() {
        System.out.println("Checking credit card payment status...");
    }
    





}

