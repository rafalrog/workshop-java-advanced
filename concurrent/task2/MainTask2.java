package concurrent.task2;

public class MainTask2 {
    public static void main(String[] args) {
        Bridge bridge = new Bridge();

        Car car1 = new Car("Car1", "Type1");
        Car car2 = new Car("Car2", "Type2");

        Thread thread1 = new Thread(() -> bridge.driveThrough(car1));
        Thread thread2 = new Thread(() -> bridge.driveThrough(car2));

        thread1.start();
        thread2.start();

    }
}
