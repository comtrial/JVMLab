package Thread;

public class MultiThreadSyncTest {
    public static void main(String[] args) {
        Runnable run = new TaskRunnable();

        new Thread(run).start();
        new Thread(run).start();
    }
}
