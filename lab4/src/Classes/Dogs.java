package Classes;

public class Dogs implements Nameable {
    private String bread;
    private String name;

    public Dogs(String bread, String name) {
        this.bread = bread;
        this.name = name;
    }

    public Dogs(String bread) {
        this.bread = bread;
    }

    public Dogs() {
        this.bread = "Corgi";
    }

    public void setBread(String bread) {
        this.bread = bread;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBread() {
        return bread;
    }
    public String getn(){
        return name;
    }
    public String getName() {
        return name+" "+bread;
    }
}
