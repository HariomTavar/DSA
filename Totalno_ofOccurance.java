public class Totalno_ofOccurance {
     public static int getLowerBound(int[] arr, int target){
        int n = arr.length;
        int s = 0;
        int e = n-1;
        int ans = n;
        while (s<=e) {
            int mid = s +(e-s)/2;
            if(arr[mid]>= target){
                ans = mid;
                e = mid -1;

            }
            else{
                s = mid+1;
            }
        }
        return ans;
    }
    public static int getUparBound(int[] arr, int target){
        int n = arr.length;
        int s = 0;
        int e = n-1;
        int ans = n;
        while (s<=e) {
            int mid = s +(e-s)/2;
            if(arr[mid]<= target){
              s = mid+1;

            }
            else{
               
                 ans = mid;
                e = mid -1;
            }
        }
        return ans;
    }

    public static void main(String [] args){
        int [] arr = {1,2,3,3,3,3,3,3,3,4,6,7};
        int target=3 ;
        int ans1 = getUparBound(arr,target);
        int ans2 = getLowerBound(arr,target);
        int ans = ans1-ans2;
        System.out.println("Total numver of occurance :" + ans );

    }
}
