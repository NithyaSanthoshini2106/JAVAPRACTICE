

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        String revs = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            rev += str.charAt(i);
        }

        System.out.println(revs);
        if (str.equalsIgnoreCase(revs)) {
            System.out.println("");
        } else {
            System.out.println("");
        }

        sc.close();
    }
}