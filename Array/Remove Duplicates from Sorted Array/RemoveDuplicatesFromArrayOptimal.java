// Remove Duplicates from an Array Optimal
import java.util.*;

class RemoveDuplicatesOptimal {

    static int removeDuplicates(int[] arr) {
        if (arr.length == 0) return 0;

        int i = 0; // slow pointer

        for (int j = 1; j < arr.length; j++) {
            if (arr[j] != arr[i]) {
                i++;
                arr[i] = arr[j];
            }
        }
        return i + 1; // length of unique array
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter array length:");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter sorted elements:");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        int len = removeDuplicates(arr);

        System.out.println("After removing duplicates:");
        for (int i = 0; i < len; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
