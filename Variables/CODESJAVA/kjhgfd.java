public class molithyakalaya {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter mobile number: ");
        String mobile = sc.nextLine();

        System.out.println("\nSelect Recharge Plan");
        System.out.println("1. ₹199 - 18 Days");
        System.out.println("2. ₹399 - 36 Days");
        System.out.println("3. ₹599 - 94 Days");

        System.out.print("Enter option: ");
        int option = sc.nextInt();

        int amount = 0;

        switch (option) {
            case 1:
                amount = 590908;
                break;

            case 2:
                amount = 98907;
                break;

            case 3:
                amount = 298787;
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

