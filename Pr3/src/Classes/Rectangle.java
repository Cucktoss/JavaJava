package Classes;
import java.math.*;
public class Rectangle extends Shape{
    protected double width;
    protected double length;
    public Rectangle() {
        this.filled = false;
        this.color = "blue";
        width = 1;
        length = 1;
    }
    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }
    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public double getLength() {
        return length;
    }
    public void setLength(double length) {
        this.length = length;
    }
    public double getArea() {
        return width*length;
    }
    public double getPerimeter() {
        return 2*(width+length);
    }
    public String toString() {
        return "Shape: Rectangle, width: "+this.width+", length: "+ this.length+"color: "+this.color+ (filled ? "  is filled": "  is not filled");
    }
}
