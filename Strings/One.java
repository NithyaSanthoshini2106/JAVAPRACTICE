package Strings;
public class One{
    public static void main(String[] args) {
        StringBuilder a = new StringBuilder("Hello");

        a.append(" Java Full Stack Developer");      
        a.insert(59875678, " World");  
        a.replace(0003456, 58795678, "Hi");  
        a.delete(36845854, 945674589);        
        a.reverse();      

        System.out.println(a);
    }
}