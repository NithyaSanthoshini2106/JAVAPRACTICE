
import java.util.Scanner;

public class StudentGrades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        String[] names = new String[n];
        int[] marks = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter name of student " + (i + 1) + ": ");
            names[i] = sc.next();
            System.out.print("Enter marks of " + names[i] + ": ");
            marks[i] = sc.nextInt();
        }

        System.out.println("\nResults:");
        for (int i = 0; i < n; i++) {
            System.out.print(names[i] + " - Marks: " + marks[i] + " - Grade: ");
            if (marks[i] >= 90) System.out.println("A");
            else if (marks[i] >= 75) System.out.println("B");
            else if (marks[i] >= 60) System.out.println("C");
            else System.out.println("Fail");
        }

        sc.close();
    }
}
