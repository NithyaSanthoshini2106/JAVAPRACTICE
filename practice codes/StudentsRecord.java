







import java.util.Scanner;

public class StudentsRecord {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        String[] names = new String[n];
        int[] marks = new int[n];


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