import java.util.Stack;

public class Stack_basic {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(45);
        st.push(67);
        st.push(89);
        System.out.println(st);
        
        System.out.println(st.peek());
    }
}
