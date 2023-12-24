import models.Point;
import models.Shape;

import java.io.File;
import java.io.FileNotFoundException;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            File file = new File("src\\source.txt");
            Scanner f = new Scanner(file);
            f.useLocale(Locale.US);
            Shape shape = new Shape();

            while (f.hasNext()) {
                double x = f.nextDouble();
                double y = f.nextDouble();
                Point point = new Point(x, y);
                shape.addPoint(point);
            }

            System.out.println(shape.getPerimeter());
            System.out.println(shape.getLongestSide());
            System.out.println(shape.getAverageSide());
            f.close();

        } catch (FileNotFoundException exception) {
            System.out.println("File not found.");
        }
    }
}