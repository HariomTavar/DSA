public class Sqrt {
    public static int mySqrt(int  arr){
    
        int s = 0;
        int e = arr;
        int ans = -1;
        while (s<=e) {
            int mid = s +(e-s)/2;
            if (mid * mid == arr) {
                return mid;
                
            }
            else if (mid*mid> arr) {
                e = mid -1;
            }
            else{
                ans = mid ;
                s = mid +1;
            }
            
        } return ans ;

    }
    public static void main(String[] args) {
        int ans = mySqrt(56);
        System.out.println(ans);
    }
}
