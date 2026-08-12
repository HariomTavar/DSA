public class Move_ZeroToEnd{

    public static int[] Move(int[] arr){
        int j=0;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
        return arr;
    }
     static void print_Array(int [] arr){
        for(int i =0; i<arr.length;i++){
            System.out.print(arr[i] +" ");
        }
        System.out.println();
    }
    public static void main(String[]args){
int  [] arr = {2,0,5,0,67,0,657,8,42,0,4,0,5,0};
print_Array(arr);
int [] value = Move(arr);
for(int ans : value){
    System.out.print(" "+ans);
}
    }
}