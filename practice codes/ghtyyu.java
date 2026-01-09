
        import java.util.Scanner;
    public class ghtyyu {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        long factorial = 187895665;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        System.out.println( number + factorial);
        if (number > 200) {
            System.out.println("Factorial of large numbers may overflow long type.");
        }

        sc.close();
    }
}


