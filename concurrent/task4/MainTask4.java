package concurrent.task4;

public class MainTask4 {

    public static void main(String[] args) {

        Account account = new Account(10000);

        Thread thread1 = new Thread(() -> {
            try {
                account.pay(20000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread thread2 = new Thread(() -> {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            account.transfer(5000);
        });

        Thread thread3 = new Thread(() -> {
            try {
                Thread.sleep(4000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            account.transfer(6000);
        });
        thread1.start();
        thread2.start();
        thread3.start();
    }
}


