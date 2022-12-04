package Classes;

public class Fork extends Dish{
    protected int sticks;
    public Fork(String material, String color, boolean broken, int sticks) {
        super(material, color, broken);
        this.sticks = sticks;
    }
    public Fork() {
        this.material = "paper";
        this.color = "blue";
        this.broken = false;
        sticks = 4;
    }
    public int getSticks() {
        return sticks;
    }
    public void setSticks(int sticks) {
        this.sticks = sticks;
    }
    public double getCost(){
        if(broken)
            return 0;
        else
            return 200*sticks;
    }
    public String toString(){
        return "material: "+material+"; color: " +color+ "; Sticks: "+sticks+(broken ? "; is broken" : "; is not broken");
    }
}
