




public class C {
    public static void main(String[] args) {
        String a = "madam";
        String b = "";
        
        for (int i = a.length() - 1; i >= 0; i--) {
            b += a.charAt(i);
        }

        if (a.equals(b))
            System.out.println(a + " is a palindrome");
        else
            System.out.println(a + " is not a palindrome");
    }
}
