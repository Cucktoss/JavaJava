import Classes.*;
import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        MyQueue<Integer> a = new MyQueue<>();
        MyQueue<Integer> b = new MyQueue<>();
        System.out.println("Введите карты игрока 1");
        Scanner input = new Scanner(System.in);
        for(int i = 0;i<5;i++)
        {
            a.offer(input.nextInt());
        }
        System.out.println("Введите карты игрока 2");
        input = new Scanner(System.in);
        for(int i = 0;i<5;i++)
        {
            b.offer(input.nextInt());
        }
        Game c = new Game(a,b);
    }
}
