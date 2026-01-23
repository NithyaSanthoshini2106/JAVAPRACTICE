public class dft {
    

 public static void main(String[] args) {
        String a = "Spoorthi Raju Adluru";
        String b = "Nithya Raju Adluru";
        
        for (int i = a.length() - 1; i >= 0; i--) {
            b += a.charAt(i);
        }

        if (a.equals(b))
            System.out.println(a);
        else
            System.out.println(a);
    }
}



