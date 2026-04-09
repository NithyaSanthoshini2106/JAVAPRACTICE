

class Student {
    String name;
    int age;

    Student(String name, int age){
        this.name = name;
        this.age = age;
    }

    void display(){
        System.out.println("");
    }
}

public class Main {
    public static void main(String[] args){
        Student s1 = new Student(null, 0);
        s1.display();


    }
}
