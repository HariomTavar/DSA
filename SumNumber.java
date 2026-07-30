import java.util.Scanner;
public class SumNumber{
     public static void main(String[]args){
        Scanner sc = new Scanner (System.in);
        int[] arr = new int[5];
        int n = arr.length;
        for(int i=0;i<=n-1;i++){
            arr[i]= sc.nextInt();
        }

        
        
        for(int value:arr){
            System.out.println(value);
        }
    }}