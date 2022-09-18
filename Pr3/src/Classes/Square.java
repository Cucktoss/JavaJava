package Classes;
import java.math.*;
public class Square extends Rectangle {
    public Square() {
        this.filled = false;
        this.color = "blue";
        width = 1;
        length = 1;
    }
    public Square(double side){
        this.filled = false;
        this.color = "blue";
        width = side;
        length = side;
    }
    public Square(double side, String color, boolean filled){
        this.filled = filled;
        this.color = color;
        width = side;
        length = side;
    }
    public double getSide(){
        return width;
    }
    public void setWidth(double side){
        width = side;
        length = side;
    }
    public void setLength(double side){
        width = side;
        length = side;
    }
    public String toString() {
        return "Shape: Square, side: "+this.width+"color: "+this.color+ (filled ? " is filled": " is not filled");
    }
}
