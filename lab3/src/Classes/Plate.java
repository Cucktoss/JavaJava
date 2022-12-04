package Classes;

public class Plate extends Dish {
    protected double radius;
    public Plate(String material, String color, boolean broken, double radius) {
        super(material, color, broken);
        this.radius = radius;
    }

    public Plate() {
        this.material = "paper";
        this.color = "blue";
        this.broken = false;
        radius = 7;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
    public double getCost(){
        if(broken)
            return 0;
        else
            return 75*radius;
    }
    public String toString(){
        return "material: "+material+"; color: " +color+ "; Radius: "+radius+(broken ? "; is broken" : "; is not broken");
    }
}
