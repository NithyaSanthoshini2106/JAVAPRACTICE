


public class ine {
    public static void main(String[] args) {
        String str = "Java";
        StringBuilder a = new StringBuilder(str);
        String b = a.toString();
        StringBuffer c = new StringBuffer(str);

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
