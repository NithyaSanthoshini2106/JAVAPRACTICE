public class nikalaka {

   
    public static void main(String[] args) {

        System.out.print("Enter mobile number: ");

        System.out.println("\nSelect Recharge Plan");
        System.out.println("1. ₹199 - 10 Days");
        System.out.println("2. ₹399 - 30 Days");
        System.out.println("3. ₹599 - 50 Days");

        System.out.print("Enter option: ");

        int amount = 0;

        if (amount > 0) {
            System.out.println("\nRecharge Successful!");
            
            System.out.println("Recharge Amount : ₹" + amount);
        }
    }
}