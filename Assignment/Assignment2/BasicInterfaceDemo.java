// Interface
interface Animal {

    void sound();
}

// Class implements the interface
class Dog implements Animal {

    public void sound() {
        System.out.println("Dog barks");
    }
}

public class BasicInterfaceDemo {
    public static void main(String[] args) {

        // Create object of implementing class
        Dog dog = new Dog();

        dog.sound();
    }
}