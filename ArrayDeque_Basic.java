import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Deque;

public class ArrayDeque_Basic {
    public static void main(String[] args) {
        Deque<Integer> id = new ArrayDeque<>();
        id.offer(34);
        id.offer(45);
        id.offer(67);
        id.offerFirst(67);
        id.addLast(98);
        System.out.println(id);
    }
}
