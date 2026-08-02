import java.util.Arrays;

public class Array0s_1s {

    // Method should be outside main()
    public static int[] sorty(int[] arr) {

        int i = 0;
        int j = arr.length - 1;

        while (i < j) {

            if (arr[i] == 1 && arr[j] == 0) {

                // Swap
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

                i++;
                j--;
            }
            else if (arr[i] == 0) {
                i++;
            }
            else if (arr[j] == 1) {
                j--;
            }
        }

        return arr;
    }

    public static void main(String[] args) {

        int[] arr1 = {0,1,0,1,0,1,0,1,0,1,0,1,0,1};

        sorty(arr1);

        System.out.println(Arrays.toString(arr1));
    }
}