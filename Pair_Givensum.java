import java.util.Scanner;
public class Pair_Givensum {
    public static void Retrun_sum(int[] arr, int target){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i]+arr[j]==target) {
                    System.out.println(arr[i] +" "+arr[j]);
                }
               
            }
        }
        
                    System.out.println("not target sum in that Array ");
                
    }
    static void print_Array(int [] arr){
        for(int i =0; i<arr.length;i++){
            System.out.print(arr[i] +" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {12,3,4,5,6,7,8,6,3,2,1,24,54,3,53,2,3,1,1};
        System.out.println("Array : ");
        print_Array(arr);
           System.out.print("Give target : ");
        int target = sc.nextInt();
        Retrun_sum(arr, target);

     sc.close();   
    }
}
