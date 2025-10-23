


public class ine {
    public static void main(String[] args) {
        String str = "Java";

        // String → StringBuilder
        StringBuilder sb = new StringBuilder(str);

        // StringBuilder → String
        String newStr = sb.toString();

        // String → StringBuffer
        StringBuffer sBuf = new StringBuffer(str);

        System.out.println("StringBuilder: " + sb);
        System.out.println("Converted back to String: " + newStr);
        System.out.println("StringBuffer: " + sBuf);
    }
}
