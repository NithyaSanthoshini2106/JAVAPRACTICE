

import java.util.Scanner;

public class Arms {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int original = num;
        int sum = 0;
        while (num != 0) {
            int rem = num % 10;
            sum += (int) Math.pow(rem, 3);
            num /= 10;
        }

        if (sum == original) {
            System.out.println(original + " is an Armstrong Number");
        } else {
            System.out.println(original + " is NOT an Armstrong Number");
        }

        sc.close();
    }
}