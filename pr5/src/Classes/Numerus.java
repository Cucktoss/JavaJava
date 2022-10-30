package Classes;

public class Numerus {
    public static void ShowNum1(int k){
        if(k<10)
            System.out.print(k);
        else{
            System.out.print(k%10+" ");
            ShowNum1(k/10);
        }
    }
    public static void ShowNum2(int k){
        if(k<10)
            System.out.print(k);
        else{
            ShowNum2(k/10);
            System.out.print(" "+k%10);
        }
    }
}
