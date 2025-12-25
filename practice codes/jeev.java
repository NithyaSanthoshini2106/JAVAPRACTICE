public class jeev {
    public static void main(String[] args) {
        String a = "Adluru NithyaRaju";
        String b = "";
        
        for (int i = a.length() - 1; i >= 0; i--) {
            b += a.charAt(i);
        }

        if (a.equals(b))
            System.out.println(a);
        else
            System.out.println(a);
    }
}

