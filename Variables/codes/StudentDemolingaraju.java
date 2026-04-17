import java.util.Scanner;

class Student {
    String name;
    int marks;

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name: ");
        System.out.print("Enter marks: ");
        marks = sc.nextInt();
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);

        if (marks >= 75)
            System.out.println("Grade: A");
        else if (marks >= 60)
            System.out.println("Grade: B");
        else
            System.out.println("Grade: C");
    }
}

public class StudentDemolingaraju {
    public static void main(String[] args) {
        Student s = new Student();
        s.input();
        s.display();
    }
}