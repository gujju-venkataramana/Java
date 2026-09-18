class Student {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println(name);
        System.out.println(age);
    }
}

public class ConstructorDemo {
    public static void main(String[] args) {

        Student student = new Student("Rahul", 20);

        student.display();
    }
}