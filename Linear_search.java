import java.util.Scanner;
public class Linear_search {
    static void linear (int arr[], int key){
        int n = arr.length ;

        for (int i =0; i<n;i++){
            if(arr[i]==key){
                System.out.println("key parsent in index :"+ i);
return;
            }
            
        }
        System.out.println("key not found  ");
    }
    static void print_Array(int [] arr){
        for(int i =0; i<arr.length;i++){
            System.out.print(arr[i] +" ");
        }
        System.out.println();
    }
    public static void main (String[] args){
Scanner sc = new Scanner(System.in);
int [] arr = {2,4,65,45,4,33,20,29,12,345,7,76};
System.out.println("arr:");
print_Array(arr);
System.out.println("Enter key");

int key = sc.nextInt();
Linear_search(arr,key);

   sc.close(); }
}
