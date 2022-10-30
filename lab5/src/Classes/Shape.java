package Classes;
import java.awt.*;
public abstract class Shape {
    protected Color color;
    protected int xPosition;
    protected int yPosition;

    public Color getColor() {
        return color;
    }

    public Shape(int xPosition, int yPosition) {
        this.xPosition = xPosition;
        this.yPosition = yPosition;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getxPosition() {
        return xPosition;
    }

    public void setxPosition(int xPosition) {
        this.xPosition = xPosition;
    }

    public void setyPosition(int yPosition) {
        this.yPosition = yPosition;
    }

    public int getyPosition() {
        return yPosition;
    }
}
