class Calculator {

    // Method with two parameters
    int add(int a, int b) {
        return a + b;
    }

    // Method with three parameters
    int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void method_overloading(String[] args) {
        Calculator obj = new Calculator();

        System.out.println("Sum of two numbers: " + obj.add(10, 20));
        System.out.println("Sum of three numbers: " + obj.add(10, 20, 30));
    }
}