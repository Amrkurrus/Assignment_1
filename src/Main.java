import models.Point;
import models.Shape;

import java.io.File;
import  java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       File file = new File("C:\\aitu\\y1t2\\itp2\\java\\Shape\\sample.txt");
       Shape shape = new Shape();

       while (in.hasNextLine()) {
            double x = in.nextDouble();
            double y = in.nextDouble();
            Point point = new Point(x, y);

       }

       double x = in.nextDouble();

        }
}