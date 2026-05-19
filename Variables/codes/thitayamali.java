import java.util.Scanner;

public class thitayamali {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] marks = new int[5];
        int total = 0;

        System.out.println("Enter marks for 5 subjects:");

        for (int i = 0; i < 5; i++) {
            marks[i] = sc.nextInt();
            total += marks[i];
        }

        double percentage = total / 5.0;
        String grade;

        if (percentage >= 90)
            grade = "A";
        else if (percentage >= 75)
            grade = "B";
        else if (percentage >= 60)
            grade = "C";
        else
            grade = "Fail";

        System.out.println("Total Marks : " + total);
        System.out.println("Percentage  : " + percentage);
        System.out.println("Grade       : " + grade);

        sc.close();
    }
}



