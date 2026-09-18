// Common parent class
class Animal {

    void eat() {
        System.out.println("Animal is eating");
    }
}

// First child class
class Dog extends Animal {

    void bark() {
        System.out.println("Dog is barking");
    }
}

// Second child class
class Cat extends Animal {

    void meow() {
        System.out.println("Cat is meowing");
    }
}

public class HierarchicalInheritanceDemo {
    public static void main(String[] args) {

        Dog dog = new Dog();
        Cat cat = new Cat();

        // Both children inherit eat()
        dog.eat();
        dog.bark();

        cat.eat();
        cat.meow();
    }
}