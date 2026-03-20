





import java.util.Scanner;

public class Student {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        String[] names = new String[n];
        int[] marks = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter name: ");
            names[i] = sc.next();
            System.out.print("Enter marks: ");
            marks[i] = sc.nextInt();
        }

        int highest = marks[0];
        String topper = names[0];

        for (int i = 0; i < n; i++) {
            if (marks[i] > highest) {
                highest = marks[i];
                topper = names[i];
            }
        }

        System.out.println("\nTopper: " + topper);
        System.out.println("Highest Marks: " + highest);

        sc.close();
    }
}