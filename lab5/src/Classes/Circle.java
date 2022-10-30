package Classes;

public class Circle extends Shape{
    protected int r;
    public Circle(int xPosition, int yPosition, int r) {
        super(xPosition, yPosition);
        this.r = r;
    }
    public int getR() {
        return r;
    }
    public void setR(int r) {
        this.r = r;
    }
}
