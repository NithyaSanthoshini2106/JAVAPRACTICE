

public class B {

    public static void main(String[] args) {
        String a = "Java a,b,c,d,e,f...";
        String b = "java 1,2,3,4,5,6,....";
        if (a.equalsIgnoreCase(b))
            System.out.println("Both strings are equal (ignoring case)");
        else
            System.out.println("Strings are different");
    }
}
 

