public class Shift_array {
static void Shifting(int [] arr){
    int temp = arr.length-1;
    for (int i = arr.length-1;i>0;i--){
        arr[i]= arr[i-1];
    }
    arr[0] = temp;
}




 public static void main(String[] args) {
    int[] arr = {23,56,78,8,0,89,90,5};
Shifting(arr);
for(int a:arr){
    System.out.println(a+" ");
}
    System.out.println();
 }   
}
