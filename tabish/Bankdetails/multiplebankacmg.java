import java.util.ArrayList;
public class multiplebankacmg {
    private ArrayList<bankaccount> accounts;

    public multiplebankacmg() {
        accounts = new ArrayList<>();
    }

    public void addAccount(bankaccount account) {
        accounts.add(account);
    }

    public void displayAllAccounts() {
        for (bankaccount account : accounts) {
            account.displayAccountDetails();
            System.out.println("--------------------");
        }
    }
    public void createAccount(int accountNumber, String accountHolderName, String accountType, double balance) {
        bankaccount newAccount = new bankaccount(accountNumber, accountHolderName, accountType, balance);
        addAccount(newAccount);
    }
    public bankaccount getAccountByNumber(int accountNumber) {
        for (bankaccount account : accounts) {
            if (account.getAccountNumber() == accountNumber) {
                return account;
            }
        }
        return null; // Account not found
    }
    public boolean closeAccount(int accountNumber) {
        bankaccount accountToClose = getAccountByNumber(accountNumber);
        if (accountToClose != null) {
            accounts.remove(accountToClose);
            return true; // Account closed successfully
        }
        return false; // Account not found
    }
    public void displayallAccounts() {
        if (accounts.isEmpty()) {
            System.out.println("No accounts available.");
        } else {
            for (bankaccount account : accounts) {
                account.displayAccountDetails();
                System.out.println("--------------------");
            }
        }
    }
}



