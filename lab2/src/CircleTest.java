import classes.*;
public class CircleTest {
    public static void main(String[] args){
        Circle x = new Circle(5.5);
        System.out.println("Радиус окружности: "+x.getRadius());
        x.setRadius(8.5203);
        System.out.println("Радиус окружности: "+ x.getRadius()+" Длина: "+ x.getLength() + " Площадь: "+x.getArea()+" Диаметр: "+ x.getDiametr());
    }
}
