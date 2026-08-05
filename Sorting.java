public class Sorting {


    static void BubbleSorting(int arr[]){
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                //swap
                 int temp = arr[j];
                 arr[j] = arr[i];
                 arr[i] = temp;                
            }
            
        }
    }
    public static void main(String[] args) {
        int arr[] ={3,4,6,8,7,5,9,6,0};
        BubbleSorting(arr);
        System.out.println("bubble sorting :");
        for (int ans : arr){
            System.out.print(ans);
        }
    
        
    }
}
