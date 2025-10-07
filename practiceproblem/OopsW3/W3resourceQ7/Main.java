package practiceproblem.OopsW3.W3resourceQ7;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();
        Account account1 = new Account("Srinivas", "AP01458245", 40000);
        Account account2 = new Account("Rahul", "TG0124587", 70000);
        Account account3 = new Account("Siddhartha", "HDFC926211", 5000);
    
        bank.addAccount(account1);
        bank.addAccount(account2);
        bank.addAccount(account3);

        // Instead of this write a method to print the values of an account. It is simpler and easy.
        // System.out.println("Name: " + account1.getName());
        // System.out.println("Account Number: " + account1.getAcc_num());
        // System.out.println("Balance: " + account1.getBalance());

        // System.out.println("Name: " + account2.getName());
        // System.out.println("Account Number: " + account2.getAcc_num());
        // System.out.println("Balance: " + account2.getBalance());

        // System.out.println("Name: " + account3.getName());
        // System.out.println("Account Number: " + account3.getAcc_num());
        // System.out.println("Balance: " + account3.getBalance());

        account1.displayInfo();
        account2.displayInfo();
        account3.displayInfo();

        ArrayList<Account> accounts = bank.getAccounts();

        System.out.println("Displaying the Accounts in the bank");

        for(Account account : accounts){
            System.out.println(account.displayInfo());
        }

        bank.depositMoney(account3, 5000);
        bank.withdrawMoney(account1, 5000);

        for(Account account : accounts){
            System.out.println(account.displayInfo());
        }
    }
}
