package Thread;

public class ThreadStaticAccount {
    private static int remainMoney = 1000;

    public int getRemainMoney() { return remainMoney; }

    public static synchronized void withdraw(int money) {
        //해당 시점에서 remainMoney 값을 메모리에서 읽어온 시점에서는 아래 조건이 true 이나
        //Thread 의 Context Switching 이 발생함에 따라 데이터 값이 변동 될 수 있다.
        if (remainMoney >= money) {
            try{
                // Thread 의 처리 속도가 빨라서 sleep 을 줘서 Context Switching 이 발생하도록
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            remainMoney -= money;
        } else {
            System.out.println("Not enough money");
        }
    }
}
