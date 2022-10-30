package Classes;
import java.util.Scanner;
public class NatRow {
    private static Scanner cat = new Scanner(System.in);
    private static int member;
    private static int count = 0;
    public static void RecOdd() {
        member = cat.nextInt();
        count++;
        if (member != 0) {
            if (count % 2 == 1)
                System.out.println(member);
            RecOdd();
        } else
            System.out.println("End");
    }
}
