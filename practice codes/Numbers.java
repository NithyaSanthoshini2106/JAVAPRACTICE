

import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextLine().length();



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