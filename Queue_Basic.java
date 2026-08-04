import java.util.LinkedList;
import java.util.Queue;

public class Queue_Basic{
    public static void main(String[] args) {
        Queue<Integer> basic = new  LinkedList<>();
        basic.offer(45);
        basic.offer(34   );
        basic.offer(56);
        System.out.println(basic);
        System.out.println(basic.peek());
        System.out.println(basic.poll());
        System.out.println(basic);
        
    }
}