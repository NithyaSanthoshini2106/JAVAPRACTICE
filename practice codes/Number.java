

import java.util.Scanner;

public class Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 3 numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int largest;

        if (a > b && a > c) {
            largest = a;
        } else if (b > c) {
            largest = b;
        } else {
            largest = c;
        }

        System.out.println("Largest: " + largest);

        sc.close();
    }
}