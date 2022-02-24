package concurrent.task4;

public class Account {
    private float balance;

    public Account(int balance) {
        this.balance = balance;
    }

    synchronized void pay(float amount) throws InterruptedException {
        while (amount > balance) {
            System.out.println("Not enough money! Waiting ... ");
            wait();
        }
        balance -= amount;
        System.out.printf("Pay %f, balance: %f%n", amount, balance);
    }

    synchronized void transfer(float amount) {
        balance += amount;
        notify();
        System.out.printf("Transfer %f, balance: %f%n", amount, balance);
    }

}
