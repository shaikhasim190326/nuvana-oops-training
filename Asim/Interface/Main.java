package Asim.Interface;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter payment amount: ");


        if (!scanner.hasNextDouble()) {
            System.out.println("Invalid input. Please enter a valid number.");
            scanner.close();
            return;
        }

        double amount = scanner.nextDouble();
       
        

        PaymentService upiService = new UpiService();
        PaymentService walletService = new WalletService();
        PaymentService creditCardService = new CreditCardService();
        PaymentStatus upiStatus = new UpiService();
        PaymentStatus walletStatus = new WalletService();
        PaymentStatus creditCardStatus = new CreditCardService();

        System.out.println("Select payment method:");
        System.out.println("1. UPI");
        System.out.println("2. Wallet");
        System.out.println("3. Credit Card");
        String choice = scanner.next();

        switch (choice) {
            case "UPI", "upi","Upi", "1":
                upiService.pay(amount);
                upiService.refund(amount);
                upiStatus.checkPaymentStatus();
                break;
            case "Wallet", "wallet","WALLET", "2":
                walletService.pay(amount);
                walletService.refund(amount);
                walletStatus.checkPaymentStatus();
                break;
            case "Credit Card", "credit card","CREDIT CARD", "3":
                creditCardService.pay(amount);
                creditCardService.refund(amount);
                creditCardStatus.checkPaymentStatus();
                break;
            default:
                System.out.println("Invalid choice.");
        }

        scanner.close();
    }
}
