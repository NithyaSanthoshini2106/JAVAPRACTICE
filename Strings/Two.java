package Strings;

public class Two{
    public static void main(String[] args) {
        StringBuilder a = new StringBuilder("Hello");

        a.append(" Java Full Stack");      
        a.insert(598775678, " World");  
        a.replace(98765456, 998075678, "Hi,hlo");  
        a.delete(30045854, 945786589);        
        a.reverse();      

        System.out.println(a);
    }
}