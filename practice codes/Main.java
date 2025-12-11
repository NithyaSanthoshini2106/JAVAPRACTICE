

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

public class Main {
    public static void main(String[] args){
        Student s = new Student("Nithya", 22);
        s.display();
    }
}
