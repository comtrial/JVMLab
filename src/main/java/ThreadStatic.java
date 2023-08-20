
public class ThreadStatic extends Thread {
    private String name;
    private static int state = 0;

    public ThreadStatic(String name) {
        this.name = name;
    }
    public void add() { state++; }
    public int get() { return state; }

    @Override
    public void run() {

    }
}
