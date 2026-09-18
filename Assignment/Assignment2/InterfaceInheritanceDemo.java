// Parent interface
interface Animal {

    void eat();
}

// Child interface inherits Animal
interface Dog extends Animal {

    void bark();
}

// Class implements the child interface
class Labrador implements Dog {

    public void eat() {
        System.out.println("Labrador is eating");
    }

    public void bark() {
        System.out.println("Labrador is barking");
    }
}

public class InterfaceInheritanceDemo {
    public static void main(String[] args) {

        Labrador dog = new Labrador();

        dog.eat();
        dog.bark();
    }
}