import java.util.Scanner;

public class Min_value {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];

        // Input array elements
        System.out.println("Enter 5 numbers:");

        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // Assume first element is minimum
        int min = arr[0];

        // Find minimum
        for(int value : arr) {

            if(value < min) {
                min = value;
            }

        }

        System.out.println("Minimum Value = " + min);
   sc.close(); }
}