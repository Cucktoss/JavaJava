package Classes;

import com.sun.security.jgss.GSSUtil;

public class Game {
    private MyQueue<Integer> a = new MyQueue<>();
    private MyQueue<Integer> b = new MyQueue<>();

    public Game(MyQueue<Integer> a, MyQueue<Integer> b) {
        this.a = a;
        this.b = b;
        Gamerun();
    }
    public void Gamerun(){
        int i;
        for(i = 1;i<=106;i++){
            if(a.peek()==0 && b.peek()==9){
                a.offer(a.poll());
                a.offer(b.poll());
            }
            if(a.peek()==9 && b.peek()==0){
                b.offer(a.poll());
                b.offer(b.poll());
            }
            if(a.getStk1().empty()){
                System.out.println("second "+ i);
                break;
            }
            if(b.getStk1().empty()){
                System.out.println("first "+ i);
                break;
            }
            if(a.peek() > b.peek()){
                a.offer(a.poll());
                a.offer(b.poll());
            }
            if(a.peek() < b.peek()){
                b.offer(a.poll());
                b.offer(b.poll());
            }
            if(a.getStk1().empty()){
                System.out.println("second "+ i);
                break;
            }
            if(b.getStk1().empty()){
                System.out.println("first "+ i);
                break;
            }
        }
        if(i==107)
            System.out.println("botva");
    }

}
