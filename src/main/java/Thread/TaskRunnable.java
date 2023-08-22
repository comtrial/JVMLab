package Thread;

public class TaskRunnable implements Runnable {
    ThreadStaticAccount threadStaticAccount = new ThreadStaticAccount();
    @Override
    public void run() {
        while (threadStaticAccount.getRemainMoney() > 0) {
            int money = (int) (Math.random() * 3 + 1) * 100;
            threadStaticAccount.withdraw(money);
            System.out.println("remain Volume: " + threadStaticAccount.getRemainMoney() );
        }
    }
}
