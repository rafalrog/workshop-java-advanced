package concurrent.task2;

public class Bridge {

    public synchronized void driveThrough(Car car) {
        System.out.println("Drive through: " + car);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Finished: " + car);

    }
}
