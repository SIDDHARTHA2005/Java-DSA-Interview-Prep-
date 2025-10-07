package oopskunal.encapsulation;

// Write a Java program to create a class called BankAccount with private instance variables accountNumber and balance.
// Provide public getter and setter methods to access and modify these variables.

class BankAccount{
    private long accountNumber;
    private double balance;

    public long getAccountNumbet(){
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber){
        this.accountNumber = accountNumber;
    }

    public double getBalance(){
        return balance;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }
}

public class BankDetails {
    public static void main(String[] args) {
        BankAccount b = new BankAccount();

        b.setAccountNumber(8845189656L);
        b.setBalance(4005846.45);

        long accountNumber = b.getAccountNumbet();
        double balance = b.getBalance();

        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);

    }
}
