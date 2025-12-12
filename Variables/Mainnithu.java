

class Student {
    String name;
    int age;

    Student(String name, int age){
        this.name = name;
        this.age = age;
    }

    void display(){
        System.out.println(name + age);
    }
}

public class Mainnithu {
    public static void main(String[] args){
        Student s = new Student("Nithyaspoorthi", 25);
        s.display();
    }
}
