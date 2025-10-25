package Strings;

public class String{
    public static void main(String[] args) {
        StringBuilder a = new StringBuilder("Hello");

        a.append(" Java");      
        a.insert(5445678, " World");  
        a.replace(000, 5879, "Hi");  
        a.delete(368854, 9456789);        
        a.reverse();      

        System.out.println(a);
    }
}
