

public class four {
    public static void main(String[] args) {
        String str = "NithyaSanthoshini";
        String rev = "SpoorthiNithu";
        
        for (int i = str.length() - 1; i >= 0; i--) {
            rev += str.charAt(i);
        }
        
        if (str.equals(rev))
            System.out.println(str + " is a palindrome");
        else
            System.out.println(str + " is not a palindrome");
    }
}
