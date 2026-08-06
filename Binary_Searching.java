public class Binary_Searching {
    public static int  Binary(int [] arr, int target){
        int n = arr.length;
        int start = 0;
        int end = n-1;
       int  mid = (start+end)/2;
       while (start<= end)
         { if (arr[mid]==target) { return mid;
        
       }
       else if (target >arr[mid]) {
        start = mid +1;
       }
       else{
        end = mid-1;
       }
mid = (start+end)/2;
        
       }


        
   return -1; }
    public static void main(String[] args) {
        int[] arr = {1,3,4,5,8,9,23,566,788,999,1010};
        int target = 566;
        int  ans = Binary(arr, target);
        System.out.println("target found in index :"+ ans);
    }
}
