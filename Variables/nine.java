


public class nine {
    public static void main(String[] args) {
        StringBuffer a = new StringBuffer("Java");

        a.append(" Programming");
        a.insert(0, "Learn ");
        a.replace(6, 10, "Core");
        a.delete(0, 6);
        a.reverse();

        System.out.println(a);
    }
}
