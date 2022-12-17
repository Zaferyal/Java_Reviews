package week12_review;

import static java.lang.Math.*;

public class Cylinder extends Shape{

    private double height, radius;

    public Cylinder(double height, double radius) {
        super("Cylinder");
        this.height = height;
        this.radius = radius;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }


    @Override
    public double calc_area() {
        return 0;
    }

    @Override
    public double calc_perimeter() {
        return 0;
    }



}
