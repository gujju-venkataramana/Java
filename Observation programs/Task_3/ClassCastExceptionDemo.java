class Animal {
}

class Dog extends Animal {
}

public class ClassCastExceptionDemo {
    public static void main(String[] args) {

        Animal animal = new Animal();

        try {
            // Animal object cannot be converted to Dog
            Dog dog = (Dog) animal;

            System.out.println("Conversion successful.");
        } catch (ClassCastException e) {
            System.out.println("Invalid type conversion.");
        }
    }
}