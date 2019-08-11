package topics.threads;

public class Worker implements Runnable {

    private String threadName;

    public Worker(String threadName) {
        this.threadName = threadName;
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(threadName + "  ->  " + i);
        }
    }
}
