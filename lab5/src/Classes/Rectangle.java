package Classes;

import java.awt.*;

public class Rectangle extends Shape{
    protected int width;
    protected int length;
    public Rectangle(int xPosition, int yPosition, int width, int length) {
        super(xPosition, yPosition);
        this.width = width;
        this.length = length;
    }
    public int getWidth() {
        return width;
    }
    public int getLength() {
        return length;
    }
    public void setWidth(int width) {
        this.width = width;
    }

    public void setLength(int length) {
        this.length = length;
    }
}
