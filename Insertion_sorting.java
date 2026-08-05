public class Insertion_sorting {
    public static  void insertion(int[] arr){
        int n = arr.length;
        for(int i = 1;i<n;i++ ){
            int curr = i;
            int pre = i-1;
            int curr_value = arr[i];
            while(pre>= 0 && curr_value < arr[pre]){
                arr[pre+1] = arr[pre];
                pre--;
            }
            arr[pre+1] = curr_value;
        }


    }
    public static void main(String[] args){
  int arr[] = {3, 4, 5676, 8, 7, 5, 9,67,78,456};

       insertion(arr);

        System.out.println("INsertion  Sorting:");

        for (int ans : arr) {
            System.out.print(ans + " ");
        }
    
    }
}
