import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(10);                    // push() adds an element to the top
        stack.push(20);
        stack.push(30);

        System.out.println("Stack: " + stack);
        System.out.println("Top: " + stack.peek()); // peek() reads the top element
        System.out.println("Search 20: " + stack.search(20)); // search() gives position from top
        System.out.println("Is Empty: " + stack.empty()); // empty() checks the stack

        System.out.println("Popped: " + stack.pop()); // pop() removes the top element
        System.out.println("Final Stack: " + stack);
    }
}
