import java.util.Scanner;

public class CharacterCounts {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

       

        int letters = 0, digits = 0, special = 0;


        System.out.println("Alphabets: " + letters);
        System.out.println("Digits: " + digits);
        System.out.println("Special chars: " + special);

        sc.close();
    }
}