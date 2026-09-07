public class jaswanthvarma {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("===== Student Management System =====");

        System.out.print("Enter student name: ");
        String name = sc.nextLine();

        System.out.print("Enter student age: ");
        int age = sc.nextInt();

        System.out.print("Enter number of subjects: ");
        int n = sc.nextInt();

        int[] marks = new int[n];
        int total = 0;

        // Read marks
        for (int i = 0; i < n; i++) {
            System.out.print("Enter marks for subject " + (i + 1) + ": ");
            marks[i] = sc.nextInt();

            if (marks[i] < 0 || marks[i] > 100) {
                System.out.println("Invalid marks! Enter between 0 and 100.");
                i--;
                continue;
            }

            total = total + marks[i];
        }

        double average = calculateAverage(total, n);
        char grade = calculateGrade(average);

        System.out.println("\n===== Student Details =====");
        System.out.println("Name     : " + name);
        System.out.println("Age      : " + age);

        System.out.println("\nSubject Marks:");

        for (int i = 0; i < marks.length; i++) {
            System.out.println("Subject " + (i + 1) + ": " + marks[i]);
        }

        System.out.println("\nTotal    : " + total);
        System.out.println("Average  : " + average);
        System.out.println("Grade    : " + grade);

        if (isPassed(marks)) {
            System.out.println("Result   : PASS");
        } else {
            System.out.println("Result   : FAIL");
        }

        System.out.println("\n===== Additional Information =====");

        if (age >= 18) {
            System.out.println("Student Status: Adult");
        } else {
            System.out.println("Student Status: Minor");
        }

        printMessage(average);

        sc.close();
    }

    public static double calculateAverage(int total, int subjects) {

        if (subjects == 0) {
            return 0;
        }

        return (double) total / subjects;
    }

    public static char calculateGrade(double average) {

        if (average >= 90) {
            return 'A';
        } else if (average >= 75) {
            return 'B';
        } else if (average >= 60) {
            return 'C';
        } else if (average >= 50) {
            return 'D';
        } else {
            return 'F';
        }
    }

    public static boolean isPassed(int[] marks) {

        for (int mark : marks) {
            if (mark < 35) {
                return false;
            }
        }

        return true;
    }

    public static void printMessage(double average) {

        if (average >= 90) {
            System.out.println("Excellent performance!");
        } else if (average >= 75) {
            System.out.println("Very good performance!");
        } else if (average >= 50) {
            System.out.println("Good. Keep improving!");
        } else {
            System.out.println("Need more practice.");
        }
    }
}
