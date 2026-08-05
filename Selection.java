public class Selection {

     static void Selectionsoorting(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            int MinIndex = i;
            for (int j = i+1; j <n; j++) {
                if (arr[j]<arr[MinIndex]) {
                    MinIndex = j;
                    
                }
                
            }
            // swap
            int temp = arr[i];
            arr[i] = arr[MinIndex];
            arr[MinIndex] = temp;
            
        }
    }
    public static void main(String[] args) {
        
        int arr[] ={3,4,6,8,7,5,9};
        Selectionsoorting(arr);
        System.out.println("Selection  sorting :");
        for (int ans : arr){
            System.out.print(ans+" ");
        }
    }
}
