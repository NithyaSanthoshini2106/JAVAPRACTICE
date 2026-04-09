

import java.util.Scanner;

public class ShoppingBill {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of items: ");
        int n = sc.nextInt();

        String[] items = new String[n];
        int[] qty = new int[n];
        double[] price = new double[n];

        double total = 0;


        System.out.println("\n===== BILL =====");
        System.out.println("Item\tQty\tPrice\tTotal");

        for (int i = 0; i < n; i++) {
            double itemTotal = qty[i] * price[i];
            total += itemTotal;

            System.out.println(items[i] + "\t" + qty[i] + "\t" +
                               price[i] + "\t" + itemTotal);
        }

        double tax = total * 0.05;
        double finalAmount = total + tax;

        System.out.println("\nSubtotal: " + total);
        System.out.println("Tax (5%): " + tax);
        System.out.println("Final Amount: " + finalAmount);

        System.out.println("\nThank you for shopping!");

        sc.close();
    }
}