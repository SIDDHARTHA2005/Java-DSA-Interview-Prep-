package practiceproblem.OopsW3.W3resourceQ7;

public class Account {
    private String name;
    private String acc_num;
    private double balance;

    public Account(String name, String acc_num, double balance){
        this.name = name;
        this.acc_num = acc_num;
        this.balance = balance;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAcc_num(String acc_num) {
        this.acc_num = acc_num;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getName(){
        return name;
    }

    public String getAcc_num() {
        return acc_num;
    }

    public double getBalance() {
        return balance;
    }

    // public double deposit(double amount){
    //     balance = balance + amount;
    //     return balance;
    // }

    // public double withdraw(double amount){
    //         if(balance >= amount){
    //         balance = balance - amount;
    //         return balance;
    //     } else {
    //         System.out.println("You account has low amount, can't withdrawal");
    //         return balance;
    //     }
    // }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }

    public String displayInfo(){
        return "Name: " + name + "|| Account Number: " + acc_num + " || Balance: " + balance;
    }
}
