import java.util.Arrays;

public class Duplicate_remove {

    static int removeduplicate(int[] arr) {

        int i = 0;
        int j = 1;
        int n = arr.length;

        while (j < n) {

            if (arr[i] == arr[j]) {
                j++;
            } else {
                i++;
                arr[i] = arr[j];
                j++;
            }
        }

        return i + 1;
    }

    public static void main(String[] args) {

        int[] arr = {3,3,4,5,5,6,6,8,8,22,23,33,33,34,54,56,77,78,88,222};

        int size = removeduplicate(arr);
        System.out.println(Arrays.toString(size));

    }
}