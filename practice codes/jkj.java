
public class jkj {
 public static void main(String[] args) {
        String a = "Spoorthi";
        String b = "Nithya Raju";
        
        for (int i = a.length() - 1; i >= 0; i--) {
            b += a.charAt(i);
        }

        if (a.equals(b))
            System.out.println(a);
        else
            System.out.println(a);
    }
}