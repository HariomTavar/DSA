public class Basic3_Qsolve {
    public static void getMix(int[] arr){
        int max = arr[0];
        int n = arr.length;
        for(int i = 1; i<n;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println(max);
    }
    static int[] Reverse_arr(int [] arr){
   int i =0;
   int j = arr.length-1;
   while (i<j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
    i++;
    j--;
   }
   return arr;
    }
    public static void main(String[] args) {
        int [] arr ={1,22,44,5,66,77,88};
        getMix(arr);
int[] ans = Reverse_arr(arr);
for (int n : ans ){
    System.out.print(  "  " +n);
}
    }
}
