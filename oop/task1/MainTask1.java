package oop.task1;

public class MainTask1 {
    public static void main(String[] args) {
        Point2D emptyPoint2D = new Point2D();
        System.out.println(emptyPoint2D.toString());

        Point2D point2D = new Point2D(1f, 10f);
        System.out.println(point2D);
        point2D.setXY(2f, 20f);
        System.out.println(point2D);
        System.out.println(point2D.getXY());


    }
}
