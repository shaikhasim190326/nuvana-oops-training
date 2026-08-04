import java.util.Scanner;
public class bankacmain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Create a new bank account
        bankaccount account = new bankaccount(123456, "John Doe", "Savings", 1000.0);
        // Manager for multiple accounts (create an instance to call non-static methods)
        multiplebankacmg multiplebankacmg = new multiplebankacmg();

        int choice;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Display Account Details");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Create Account");
            System.out.println("5. Close Account");
            System.out.println("6. Display All Accounts");
            System.out.println("7. Exit");
            
            
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice) {
               case 1:
                    account.displayAccountDetails();
                    break;
                case 2:
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = sc.nextDouble();
                    account.deposit(depositAmount);
                    System.out.println("Deposit successful. New balance: $" + account.getBalance());
                    break;
                case 3:
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = sc.nextDouble();
                    account.withdraw(withdrawAmount);
                    System.out.println("Withdrawal successful. New balance: $" + account.getBalance());
                    break;
                case 4:
                    System.out.print("Enter account number: ");
                    int newAccountNumber = sc.nextInt();
                    sc.nextLine(); // Consume newline
                    System.out.print("Enter account holder name: ");
                    String newAccountHolderName = sc.nextLine();
                    System.out.print("Enter account type: ");
                    String newAccountType = sc.nextLine();
                    System.out.print("Enter initial balance: ");
                    double newBalance = sc.nextDouble();
                    multiplebankacmg.createAccount(newAccountNumber, newAccountHolderName, newAccountType, newBalance);
                    System.out.println("Account created successfully.");
                    break;
                case 5:
                    System.out.print("Enter account number to close: ");
                    int closeAccountNumber = sc.nextInt();
                    boolean isClosed = multiplebankacmg.closeAccount(closeAccountNumber);
                    if (isClosed) {
                        System.out.println("Account closed successfully.");
                    } else {
                        System.out.println("Account not found.");
                    }
                    break;
                case 6:
                    multiplebankacmg.displayAllAccounts();
                    break;
                case 7:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 7);
        sc.close();
    }
}







  
 
