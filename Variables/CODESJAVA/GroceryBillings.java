import java.util.Scanner;

public class GroceryBillings {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double total = 0;
        char choice;

        do {
            System.out.print("Enter item name: ");
            String item = sc.next();

            System.out.print("Enter quantity: ");
            int qty = sc.nextInt();

            System.out.print("Enter price: ");
            double price = sc.nextDouble();

            double amount = qty * price;
            total += amount;

            System.out.println(item + " Amount: ₹" + amount);

            System.out.print("Add more items? (y/n): ");
            choice = sc.next().charAt(0);

        } while (choice == 'y' || choice == 'Y');

        System.out.println("\nTotal Bill Amount: ₹" + total);

        sc.close();
    }
}