package topics.threads;

public class ThreadTest {

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            new Thread(new Worker("T" + i)).start();
        }
    }
}
