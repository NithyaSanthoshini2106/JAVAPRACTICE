



import java.util.Scanner;

class BankAccount {

    double balance = 6787890;

    void deposit(double amount) {
        balance += amount;
        System.out.println(amount);
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println(amount);
        } else {
            System.out.println("Insufficient balance");
        }
    }

    void displayBalance() {
        System.out.println(balance);
    }
}

public class hgf {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        BankAccount account = new BankAccount();

        account.deposit(1000);
        account.withdraw(500);
        account.displayBalance();

        sc.close();
    }
}
