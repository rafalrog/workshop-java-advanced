package oop.task1;

import java.util.ArrayList;

public class Point2D {

    private Float x;
    private Float y;

    protected Point2D() {
        x = 0f;
        y = 0f;
    }

    public Point2D(Float x, Float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public ArrayList<Float> getXY() {
        ArrayList<Float> arrayList = new ArrayList<Float>();
        arrayList.add(x);
        arrayList.add(y);
        return arrayList;
    }

    public void setX(Float x) {
        this.x = x;
    }

    public void setY(Float y) {
        this.y = y;
    }

    public void setXY(Float x, Float y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "(" + x + "," + y +")";
    }
}
