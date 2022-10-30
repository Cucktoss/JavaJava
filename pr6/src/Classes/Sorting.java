package Classes;

public class Sorting {
    public static void insertionSort(Comparable[] x) {
        Comparable temp;
        for (int i = 1; i < x.length; i++)
            for (int j = i; j > 0 && (x[j - 1].compareTo(x[j]) > 0); j--) {
                temp = x[j];
                x[j] = x[j - 1];
                x[j - 1] = temp;
            }
    }
}
