// Base class
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

public class Multilevel_inheritance{
    public static void main(String[] args) {

        // Puppy can access methods from all levels
        Puppy puppy = new Puppy();

        puppy.eat();
        puppy.bark();
        puppy.play();
    }
}