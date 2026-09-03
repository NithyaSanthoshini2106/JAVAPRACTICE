import java.util.Scanner;

public class StudentMarks {

    static String getGrade(int marks) {
        if (marks >= 90) {
            return "A+";
        } else if (marks >= 80) {
            return "A";
        } else if (marks >= 70) {
            return "B";
        } else if (marks >= 60) {
            return "C";
        } else if (marks >= 50) {
            return "D";
        } else {
            return "F";
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = sc.nextLine();

        System.out.print("Enter number of subjects: ");
        int subjects = sc.nextInt();

        int total = 0;

        for (int i = 1; i <= subjects; i++) {
            System.out.print("Enter marks for subject " + i + ": ");
            int marks = sc.nextInt();

            if (marks >= 0 && marks <= 100) {
                total = total + marks;
            } else {
                System.out.println("Invalid marks!");
                i--;
            }
        }

        double average = (double) total / subjects;
        String grade = getGrade((int) average);

        System.out.println("\n----- Student Result -----");
        System.out.println("Name: " + name);
        System.out.println("Total Marks: " + total);
        System.out.println("Average: " + average);
        System.out.println("Grade: " + grade);

        if (average >= 50) {
            System.out.println("Result: PASS");
        } else {
            System.out.println("Result: FAIL");
        }

        if (average >= 90) {
            System.out.println("Excellent performance!");
        } else if (average >= 75) {
            System.out.println("Very good performance!");
        } else if (average >= 50) {
            System.out.println("Good. Keep improving!");
        } else {
            System.out.println("Need more practice.");
        }

        sc.close();
    }
}