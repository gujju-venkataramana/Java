// Parent class
class Animal {

    void eat() {
        System.out.println("Animal is eating");
    }
}

// Child class inherits Animal
class Dog extends Animal {

    void bark() {
        System.out.println("Dog is barking");
    }
}

public class SingleInheritanceDemo {
    public static void main(String[] args) {

        // Create object of child class
        Dog dog = new Dog();

        dog.eat();
        dog.bark();
    }
}