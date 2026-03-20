

import java.util.Scanner;

public class q {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();

        String[] names = new String[n];
        double[] salaries = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter employee name: ");
            names[i] = sc.next();
            System.out.print("Enter salary: ");
            salaries[i] = sc.nextDouble();
        }

        System.out.println("\nEmployee Details:");
        double totalSalary = 0;

        for (int i = 0; i < n; i++) {
            System.out.println("Name: " + names[i] + 
                               ", Salary: " + salaries[i]);
            totalSalary += salaries[i];
        }

        System.out.println("Total Salary Expense: " + totalSalary);
        System.out.println("Average Salary: " + (totalSalary / n));

        sc.close();
    }
}