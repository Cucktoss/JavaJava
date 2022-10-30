package Classes;
import java.lang.*;
public class Student implements Comparable<Student> {
    private int IDNumber;

    public Student(int IDNumber) {
        this.IDNumber = IDNumber;
    }

    public int getIDNumber() {
        return IDNumber;
    }

    public void setIDNumber(int IDNumber) {
        this.IDNumber = IDNumber;
    }
    public int compareTo(Student p){

        return IDNumber-p.getIDNumber();
    }
}
