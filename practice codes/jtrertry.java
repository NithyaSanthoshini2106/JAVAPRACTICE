



import java.util.Scanner;

class poiuytr {

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

public class jtrertry {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        sc.close();
    }
}
