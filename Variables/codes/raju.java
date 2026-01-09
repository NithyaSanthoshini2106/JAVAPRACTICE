package codes;


    import java.util.Scanner;

class Student {
    String name;
    int rollNo;
    int marks;

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Name: spoorthi raju");
        name = sc.nextLine();
        System.out.print("Enter Roll No: 21f11690");
        rollNo = sc.nextInt();
        System.out.print("Enter Marks: 95 ");
        marks = sc.nextInt();
    }

    void display() {
        System.out.println("\nStudent Details");
        System.out.println(name);
        System.out.println(rollNo);
        System.out.println(marks);
        if (marks >= 35)
            System.out.println("Result: Pass");
        else
            System.out.println("Result: Fail");
    }

    public static void main(String[] args) {
        Student s = new Student();
        s.input();
        s.display();
    }
}


