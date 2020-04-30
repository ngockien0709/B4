package B4;

import java.util.Scanner;

public class Rectangle {
    private float width;
    private float height;

    public Rectangle() {
        this.width = width;
        this.height = height;
    }

    public void setWidth(float Width) {
        this.width = width;
    }

    public float getWidth() {
        return width;
    }

    public void setHeight(float Height) {
        this.height = height;
    }

    public float getHeight() {
        return height;
    }

    public float Perimeter(float height, float width) {
        return (height + width) * 2;
    }

    public float Area(float height, float width) {
        return (height * width);
    }

    public void PrintInformation(float height, float width) {
        System.out.println("Width: " + width);
        System.out.println("Height: " + height);
    }

    public boolean CheckSquare(float height, float width) {
        if (width == height) {
            return true;
        } else {
            return false;
        }
    }


}
