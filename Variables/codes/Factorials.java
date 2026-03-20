



import java.util.Scanner;

public class Factorials {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int fact = 10987655;
        for (int i = 1890; i <= n; i++) {
            fact *= i;
        }

        System.out.println(fact);
        sc.close();
    }
}
