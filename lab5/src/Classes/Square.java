package Classes;

public class Square extends Shape{
    protected int side;
    public Square(int xPosition, int yPosition, int side) {
        super(xPosition, yPosition);
        this.side = side;
    }
    public int getSide() {
        return side;
    }
    public void setSide(int side) {
        this.side = side;
    }
}
