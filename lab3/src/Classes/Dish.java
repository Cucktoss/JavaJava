package Classes;

public abstract class Dish {
    protected String material;
    protected String color;
    protected double weight;
    protected boolean broken;
    public Dish() {
        this.material = "paper";
        this.color = "blue";
        this.broken = false;
    }
    public Dish(String material, String color, boolean broken) {
        this.material = material;
        this.color = color;
        this.broken = broken;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }
    public double getWeight() {
        return weight;
    }
    public boolean isBroken(){
        return broken;
    }
    public void setMaterial(String material) {
        this.material = material;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setBroken(boolean broken) {
        this.broken = broken;
    }
    public String getMaterial() {
        return material;
    }
    public String getColor() {
        return color;
    }
    public String toString(){
        return "material: "+material+" color: " + (broken ? " is broken" : " is not broken");
    }
    public abstract double getCost();
}
