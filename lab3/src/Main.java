import Classes.*;
public class Main {
    public static void main(String[] args) {
        Fork a = new Fork("steel","red",false,3);
        Plate b = new Plate("paper","green",false,20);
        System.out.println("цена вилки " + a.getCost());
        System.out.println("Цена тарелки " + b.getCost());
        System.out.println(a);
        System.out.println(b);
    }
}
