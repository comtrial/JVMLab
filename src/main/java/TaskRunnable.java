

public class TaskRunnable implements Runnable {
    ThreadStatic threadStatic;

    public TaskRunnable(ThreadStatic threadStatic) {
        this.threadStatic = threadStatic;
    }

    @Override
    public void run() {
        threadStatic.run();
    }
}
