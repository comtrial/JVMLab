
public abstract class Thread {
    public static void main(String[] args) {
        System.out.println("hi");

        TaskRunnable[] threads = new TaskRunnable[10];
        for (int loop = 0; loop < 10; loop++) {
            ThreadStatic thread = new ThreadStatic("thread" + loop);
            threads[loop] = new TaskRunnable(thread);
        }

        for (int loop = 0; loop < 10; loop++) {
            threads[loop].start();

        }
    }

    public abstract void run();
}
