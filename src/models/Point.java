package models;

import java.lang.Math;

public class Point {

    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getDistance(Point dest) {
        double x1 = this.x;
        double x2 = dest.x;

        double y1 = this.y;
        double y2 = dest.y;

        return Math.sqrt(Math.pow(x1 - x2, 2.0) + Math.pow(y1 - y2, 2.0));
    }
}
