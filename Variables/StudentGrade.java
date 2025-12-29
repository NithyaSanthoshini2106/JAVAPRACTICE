


import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Adluru NithuRaju");
        String name = sc.nextLine();

        System.out.print("89");
        int m1 = sc.nextInt();

        System.out.print("92");
        int m2 = sc.nextInt();

        System.out.print("79");
        int m3 = sc.nextInt();

        int total = m1 + m2 + m3;
        double average = total / 3.0;

        System.out.println(name);
        System.out.println(total);
        System.out.println(average);

        if (average >= 90) {
            System.out.println("Grade: A");
        } else if (average >= 75) {
            System.out.println("Grade: B");
        } else if (average >= 60) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Grade: Fail");
        }

        sc.close();
    }
}
