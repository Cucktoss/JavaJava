import Classes.*;
import Classes.Rectangle;

import javax.swing.*;
import java.awt.*;

public class RandomFigure extends JFrame{
    private Square[] squares;
    private Rectangle[] rects;
    private Circle[] circles;
    private int voice;
    private int lenRects;
    private int lenCircles;
    private int lenSquares;
    RandomFigure()
    {
        super("LAB-5. TASK-1.");
        setLayout(null);
        setSize(1000,1000);
        setNumberObjectives();
        setObjectives();
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
    public void paint(Graphics g){
        for (int i = 0; i < lenRects; i++) {
            g.drawRect(rects[i].getxPosition(), rects[i].getyPosition(), rects[i].getWidth(), rects[i].getLength());
            g.setColor(rects[i].getColor());
            g.fillRect(rects[i].getxPosition(), rects[i].getyPosition(), rects[i].getWidth(), rects[i].getLength());
        }
        for (int i = 0; i < lenCircles; i++) {
            g.drawOval(circles[i].getxPosition(), circles[i].getyPosition(), circles[i].getR(), circles[i].getR());
            g.setColor(circles[i].getColor());
            g.fillOval(circles[i].getxPosition(), circles[i].getyPosition(), circles[i].getR(), circles[i].getR());
        }
        for (int i = 0; i < lenSquares; i++){
            g.drawRect(squares[i].getxPosition(), squares[i].getyPosition(), squares[i].getSide(), squares[i].getSide());
            g.setColor(squares[i].getColor());
            g.fillRect(squares[i].getxPosition(), squares[i].getyPosition(), squares[i].getSide(), squares[i].getSide());
        }

    }
    private void setNumberObjectives() {
        for (int i = 0; i < 20; i++) {
            voice = (int) (Math.random() * 2 + 1.5);
            switch (voice) {
                case 1: {
                    lenRects += 1;
                    break;
                }
                case 2: {
                    lenCircles += 1;
                    break;
                }
                case 3: {
                    lenSquares += 1;
                    break;
                }
            }
        }
        rects = new Rectangle[lenRects];
        circles = new Circle[lenCircles];
        squares = new Square[lenSquares];
    }
    protected Color newColor() {
        int r = (int) (Math.random() * 255);
        int b = (int) (Math.random() * 255);
        int g = (int) (Math.random() * 255);
        Color cl = new Color(r,b,g);
        return cl;
    }
    private void setObjectives() {
        for (int i = 0; i < lenRects; i++) {
            int a = (int) (Math.random() * 150+15);
            int b = (int) (Math.random()* 150+15);
            int c = (int) (Math.random()*700+100);
            int d = (int) (Math.random()*700+100);
            rects[i] = new Rectangle(c, d, a , b );
            rects[i].setColor(newColor());
        }
        for (int i = 0; i < lenCircles; i++) {
            int c = (int) (Math.random()*700+100);
            int d = (int) (Math.random()*700+100);
            int r = (int) (Math.random() * 150+15);
            circles[i] = new Circle(c,  d,  r );
            circles[i].setColor(newColor());
        }
        for (int i = 0; i < lenSquares; i++){
            int c = (int) (Math.random()*700+100);
            int d = (int) (Math.random()*700+100);
            int a = (int) (Math.random() * 150+15);
            squares[i] = new Square(c,d, a);
            squares[i].setColor(newColor());
        }
    }
    public static void main(String[] args)
    {
        new RandomFigure();
    }
}
