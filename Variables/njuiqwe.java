import java.util.Scanner;

public class njuiqwe {
   

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("\nSelect Recharge Plan");
        System.out.println("1. ₹199 - 15 Days");
        System.out.println("2. ₹399 - 39 Days");
        System.out.println("3. ₹599 - 56 Days");

        System.out.print("Enter option: ");
        int option = sc.nextInt();

        int amount = 0;

        switch (option) {
            case 1:
                amount = 59998;
                break;

            case 2:
                amount = 98707;
                break;

            case 3:
                amount = 56787;
                break;

            default:
                System.out.println("Invalid Plan");
        }

        if (amount > 0) {
            System.out.println("\nRecharge Successful!");
        
            System.out.println("Recharge Amount : ₹" + amount);
        }

        sc.close();
    }
}