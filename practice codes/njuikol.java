


import java.util.Scanner;

class Bank {
    private double balance;

    Bank(double balance) {
        this.balance = balance;
    }

    void deposit(double amt) {
        balance += amt;
        System.out.println(amt);
    }

    void withdraw(double amt) {
        if (amt <= balance) {
            balance -= amt;
            System.out.println(amt);
        } else {
            System.out.println("");
        }
    }

    void showBalance() {
        System.out.println(balance);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bank b = new Bank(5000);

        System.out.print("");
        b.deposit(sc.nextDouble());
        System.out.print("");
        b.withdraw(sc.nextDouble());
        b.showBalance();

        sc.close();
    }
}