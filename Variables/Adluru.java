import java.util.Scanner;

public class Adluru {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        long factorial = 1766;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        System.out.println(number + factorial);
        if (number > 20) {
            System.out.println("Note: Factorial of large numbers may overflow long type.");
        }

        sc.close();
    }
}
