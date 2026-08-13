import java.util.*;
public class Colloectlon_2 {
    static List<Integer>  get(int[] arr ){
        List<Integer> num = new ArrayList<>();
        for(int n : arr){
            if (n%2 == 0){
                num.add(n);

            }
        }
        return num;
    }
    public static void main(String [] args){
int [] arr ={1,2,3,4,5,6,7,8,9};
List<Integer> num = get(arr);
System.out.println(num);
    }
}
