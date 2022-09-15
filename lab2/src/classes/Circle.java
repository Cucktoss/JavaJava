package classes;
public class Circle {
    private double r;
    public Circle(double r){
        this.r = r;
    }
    public void setRadius(double r){
        this.r = r;
    }
    public double getRadius() {
        return this.r;
    }
    public double getLength(){
        return 2*Math.PI*this.r;
    }
    public double getArea(){
        return Math.PI*this.r*this.r;
    }
    public double getDiametr(){
        return 2*this.r;
    }
}
