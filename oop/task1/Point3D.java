package oop.task1;

import java.util.ArrayList;

public class Point3D extends Point2D {

    private Float z;

    public Point3D(Float x, Float y, Float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public ArrayList<Float> getXYZ() {
        ArrayList<Float> arrayList = new ArrayList<Float>();
        arrayList.add(super.getX());
        arrayList.add(super.getY());
        arrayList.add(z);
        return arrayList;
    }

    public void setZ(Float z) {
        this.z = z;
    }

    @Override
    public String toString() {
        return "(" + super.getX() + "," + super.getY() + "," + z + ")";
    }
}
