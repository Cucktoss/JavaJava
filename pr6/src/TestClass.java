import Classes.*;
import static Classes.Sorting.*;
public class TestClass {

    public static void main(String[] args) {
        Student[] a = new Student[5];
        for(int i =0;i<a.length;i++)
        {
            a[i]=new Student(1);
        }
        a[0].setIDNumber(10);
        a[1].setIDNumber(5);
        a[2].setIDNumber(17);
        a[3].setIDNumber(8);
        a[4].setIDNumber(1);
        insertionSort(a);
        for(int i =0;i<a.length;i++)
        {
            System.out.println(a[i].getIDNumber());
        }
    }
}
