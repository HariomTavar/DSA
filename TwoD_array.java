import java.util.ArrayList;
import java.util.Arrays;
public class TwoD_array{

public static int TwoD(int[][] arr){
    ArrayList<Integer> ad = new ArrayList<>();
    int m = arr.length;
    int  n = arr[0].length;
    for(int row = 0; row <n;row++){
        int sum =0;
        for( int col = 0; col<n; col++){
            int value = arr[row][col];
            sum= sum + value;
        }
        System.out.println();
        ad.add(sum);
    }

      return sum;
 }
    public static void main(String[] args){
        int[][] arr = {{2,3,4,},{4,5,6},{6,7,8}};
         TwoD(arr);
         
        System.out.print(TwoD(arr));
    }
    public TwoD_array() {
    }
    @Override
    public String toString() {
        return "TwoD_array []";
    }
}