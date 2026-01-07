
import java.util.Scanner;

public class unim {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        System.out.println(reversed);
        if (str.equalsIgnoreCase(reversed)) {
            System.out.println(str);
        } else {
            System.out.println(str);
        }

        sc.close();
    }
}
