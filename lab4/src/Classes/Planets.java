package Classes;

public class Planets implements Nameable{
    private String name;

    public Planets(String name) {
        this.name = name;
    }

    public Planets() {
        this.name = "EARTH";
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
}
