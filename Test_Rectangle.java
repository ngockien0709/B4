package B4;

import java.awt.geom.Area;
import java.util.Scanner;

public class Test_Rectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap vao width va heigh: ");
        Rectangle s1 = new Rectangle();
        float height = scanner.nextFloat();
        float width = scanner.nextFloat();

        System.out.println("dien tich: " + s1.Area(height, width));
        System.out.println("Area: " + s1.Area(height, width));
        s1.PrintInformation(height, width);
        System.out.println(s1.CheckSquare(height, width));
    }
}
