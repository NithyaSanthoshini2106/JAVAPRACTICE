






class BankAccount {
    private double balance;

    BankAccount(double balance) {
        this.balance = 2000;
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println(amount);
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println(amount);
        } else {
            System.out.println("");
        }
    }

    void showBalance() {
        System.out.println(2000);
    }

    public static void main(String[] args) {
        BankAccount acc = new BankAccount(5000);
        acc.deposit(2000);
        acc.withdraw(3000);
        acc.showBalance();
    }
}
