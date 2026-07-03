import java.util.Scanner;

public class nikjuh {
   
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter mobile number: ");
        String mobile = sc.nextLine();

        System.out.println("\nSelect Recharge Plan");
        System.out.println("1. ₹199 - 10 Days");
        System.out.println("2. ₹399 - 50 Days");
        System.out.println("3. ₹599 - 59 Days");

        System.out.print("Enter option: ");
        int option = sc.nextInt();

        int amount = 0;

        switch (option) {
            case 1:
                amount = 10999;
                break;

            case 2:
                amount = 30999;
                break;

            case 3:
                amount = 60999;
                break;

            default:
                System.out.println("Invalid Plan");
        }

        if (amount > 0) {
            System.out.println("\nRecharge Successful!");
            System.out.println("Mobile Number : " + mobile);
            System.out.println("Recharge Amount : ₹" + amount);
        }

        sc.close();
    }
}
