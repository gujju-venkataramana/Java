class NumberThread extends Thread {

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Number: " + i);
        }
    }
}

class MessageThread extends Thread {

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Message: Hello");
        }
    }
}

public class MultipleThreadsDemo {
    public static void main(String[] args) {

        NumberThread t1 = new NumberThread();
        MessageThread t2 = new MessageThread();

        t1.start();
        t2.start();
    }
}
