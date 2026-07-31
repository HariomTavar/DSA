import java.util.ArrayList;
import java.util.Iterator;
public class Arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(100);
        arr.add(0,45);
        System.out.println(arr);
        Iterator<Integer> iter = arr.iterator();
        while(iter.hasNext()){
            System.out.println("element :"+ iter.next());
        }
    }
}
