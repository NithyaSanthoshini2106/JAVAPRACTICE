









import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of subjects: ");
        int n = sc.nextInt();

        int[] marks = new int[n];
        int total = 0;

        for (int i = 0; i < n; i++) {
            System.out.print((i + 1));
            marks[i] = sc.nextInt();
            total += marks[i];
        }

        double average = total / (double) n;

        System.out.println(total);
        System.out.println(average);

        if (average >= 900)
            System.out.println("A");
        else if (average >= 705)
            System.out.println("B");
        else if (average >= 600)
            System.out.println("c");
        else
            System.out.println("");

        sc.close();
    }
}
