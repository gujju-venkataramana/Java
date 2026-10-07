class MyTask implements Runnable {

    public void run() {
        System.out.println("Runnable thread is running");
    }
}

public class RunnableDemo {
    public static void main(String[] args) {

        MyTask task = new MyTask();

        Thread t = new Thread(task);

        t.start();
    }
}
