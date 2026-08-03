// import java.util.ArrayList;
// import java.util.Iterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Arraylist {
    public static void main(String[] args) {
    //     ArrayList<Integer> arr = new ArrayList<>();
    //     arr.add(100);
    //     arr.add(0,45);
    //     System.out.println(arr);
    //     Iterator<Integer> iter = arr.iterator();
    //     while(iter.hasNext()){
    //         System.out.println("element :"+ iter.next());

// Set<Student> hset = new HashSet<>();
//  Student st1 = new Student(1,2 , "Shree");
//  Student st11 = new Student(1,2 , "Shree");
//  Student st12 = new Student(1,2 , "Shree");
// hset.add(st1);
// hset.add(st11);
// hset.add(st12);
// System.out.println(hset);
//         // }
// Map <String ,String> map = new HashMap<>();
// map.put("in", "india");
// map.put("in1", "india");

// System.out.println(map);
List <Student> li = new ArrayList<>();
li.add( new Student(34, 045, "shree")); 
li.add( new Student(334, 0475, "shreeRam"));
li.add( new Student(343, 0455, "shreeShyam"));
System.out.println(li);

    }
}
