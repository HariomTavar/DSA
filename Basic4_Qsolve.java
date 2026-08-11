public class Basic4_Qsolve {

    static int[] Rotate_array(int[] arr){
       
        int n = arr.length;
         int last = arr[n-1];
        for(int i = n -1; i>0;i--){
            arr[i] = arr[i-1];
        }
        arr[0] = last;
return arr;
    }
    static void print_Array(int [] arr){
        for(int i =0; i<arr.length;i++){
            System.out.print(arr[i] +" ");
        }
        System.out.println();
    }
    public static void main(String[] args){
int[] arr = {2,4,5,6,67,69,787};
  System.out.println("before rotating");
print_Array(arr);
  System.out.println("after rotating");

int[] pri = Rotate_array(arr);
for (int ans : pri ){
(ans+" ");
}
    }
}
