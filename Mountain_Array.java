public class Mountain_Array {
    static int searching (int[] arr, int target){
        int n = arr.length;
        int s = 0;
        int e = n-1;
        int ans = -1;
        while (s<=e) {
            int mid = s +(e-s)/2;
            if(arr[mid]<arr[mid+1]){
                s = mid+1;

            }
            else{
                ans = mid ;
                e = mid -1;
            }
    }            return ans;

}
    public static void main (String [] args){
 int [] arr = {1,2,3,3,3,3,3,3,3,4,6,7};
        int target=3 ;
       int  ans = searching(arr,target);
        System.out.println("Total numver of occurance :" + ans );

    }
}
