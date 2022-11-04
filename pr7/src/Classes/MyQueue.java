package Classes;
import java.util.*;
public class MyQueue<T> {
    private Stack<T> stk1 =  new Stack<>();
    public void change(){
        Stack<T> stk2 = new Stack<>();
        while(!stk1.empty()){
            stk2.push(stk1.pop());
        }
        stk1 = stk2;
    }
    public T offer(T a){
        this.change();
        stk1.push(a);
        this.change();
        return a;
    }
    public T poll(){
        return stk1.pop();
    }
    public T peek(){
        return stk1.peek();
    }
    public Stack<T> getStk1() {
        return stk1;
    }
}
