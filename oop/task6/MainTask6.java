package oop.task6;

public class MainTask6 {
    public static void main(String[] args) {
        Movable movablePoint = new MovablePoint(20, 20, 6, 6);
        System.out.println(movablePoint);
        movablePoint.moveRight();
        movablePoint.moveUp();
        System.out.println(movablePoint);
        Movable movableCircle = new MovablePoint(40, 60, 8, 8);
        System.out.println(movableCircle);
        movableCircle.moveRight();
        movableCircle.moveUp();
        System.out.println(movableCircle);
    }
}

