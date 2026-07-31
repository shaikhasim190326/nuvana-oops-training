
import java.util.Scanner;

public class bankacmain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Create a new bank account
        bankaccount account = new bankaccount(123456, "John Doe", "Savings", 1000.0);

        int choice;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Display Account Details");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
               switch (choice) {
        case 1 -> account.displayAccountDetails();
        case 2 -> {
            System.out.print("Enter amount to deposit: ");
            double depositAmount =sc.nextDouble();
            account.deposit(depositAmount);
            System.out.println("After depositing $" + depositAmount + ", Balance: $" + account.getBalance());
            }
        case 3 -> {
            System.out.print("Enter amount to withdraw: ");
            double withdrawAmount = sc.nextDouble();
            account.withdraw(withdrawAmount);
            System.out.println("After withdrawing $" + withdrawAmount + ", Balance: $" + account.getBalance());
            }
        case 4 -> System.out.println("Exiting...");
        default -> System.out.println("Invalid choice. Please try again.");
     }
        } while (choice != 4);

 
    }
    
}
  
 
