// Common parent class
class Animal {

    void eat() {
        System.out.println("Animal is eating");
    }
}

// Dog inherits Animal
class Dog extends Animal {

    void bark() {
        System.out.println("Dog is barking");
    }
}

// Puppy inherits Dog
class Puppy extends Dog {

    void play() {
        System.out.println("Puppy is playing");
    }
}

// Cat also inherits Animal
class Cat extends Animal {

    void meow() {
        System.out.println("Cat is meowing");
    }
}

public class HybridInheritanceDemo {
    public static void main(String[] args) {

        Puppy puppy = new Puppy();
        Cat cat = new Cat();

        // Puppy gets methods from Animal and Dog
        puppy.eat();
        puppy.bark();
        puppy.play();

        // Cat gets method from Animal
        cat.eat();
        cat.meow();
    }
}