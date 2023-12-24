package models;

import java.util.ArrayList;

public class Shape {
    private ArrayList<Point> points;

    public Shape() {
        points = new ArrayList<>();
    }

    public void addPoint(Point point) {
        points.add(point);
    }

    private double[] getSides() {
        double[] sides = new double[points.size()];
        for (int i = 0; i < points.size() - 1; ++i) {
            sides[i] = points.get(i).getDistance(points.get(i + 1));
        }
        sides[points.size() - 1] = points.getLast().getDistance(points.getFirst());
        return sides;
    }

    public double getPerimeter() {
        double[] sides = getSides();
        double perimeter = 0;
        for (int i = 0; i < points.size(); ++i) {
            perimeter += sides[i];
        }
        return perimeter;
    }

    public double getLongestSide() {
        double[] sides = getSides();
        double longest = sides[1];
        for (int i = 0; i < points.size(); ++i) {
            if (longest < sides[i]) {
                longest = sides[i];
            }
        }
        return longest;
    }

    public double getAverageSide() {
        double sum = getPerimeter();
        double[] sides = getSides();
        double avarage = sum / sides.length;

        return avarage;
    }
}
