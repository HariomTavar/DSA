public class Reserse_Array {
    static void re_array(int[] arr){
        int n = arr.length;
        int i=0;
        int j= n-1;
        while (i<=j) {
            int tep = arr[i];
            arr[i]= arr[j];
            arr[j] = tep;
            i++;
            j--;
        }
        for(int k : arr){
            System.out.println("linewise"+k);
        }
    }
    public static void main(String[] args) {
        int[] arr = {23,4,5,6,7,8,9,0,112};
        re_array(arr);
    }
}
