// First interface
interface Father {

    void work();
}

// Second interface
interface Mother {

    void cook();
}

// Child implements both interfaces
class Child implements Father, Mother {

    public void work() {
        System.out.println("Child is working");
    }

    public void cook() {
        System.out.println("Child is cooking");
    }
}

public class MultipleInheritance_usingInterface {
    public static void main(String[] args) {

        // Child gets behavior from both interfaces
        Child child = new Child();

        child.work();
        child.cook();
    }
}