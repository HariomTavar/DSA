import java.util.HashMap;

public class Control_manuplationModeCount {
    static void Mode_count(int [] arr){
        HashMap<Integer , Integer> hash = new HashMap<>();
for(int num : arr){
    hash.put(num, hash.getOrDefault(num,0)+1);
}
for ( int i: hash.keySet()){
    System.out.println(i+"<---->"+hash.get(i));
}

    }
    public static void main(String[] args) {
    int [] arr ={1,3,77,3,4,6,6,6,6,6,6,2,3,4,4,45,5,8,556,6,6777};
    Mode_count(arr);
        
    }
}
