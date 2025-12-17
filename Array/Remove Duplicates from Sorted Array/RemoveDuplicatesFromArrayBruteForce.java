// Remove Duplicates from an Array BruteForce
import java.util.*;

class RemoveDuplicatesBrute {

    static int[] removeDuplicates(int[] arr) {
        int n = arr.length;
        if (n == 0) return arr;

        int[] temp = new int[n];
        int k = 0;

        // first element is always unique
        temp[k++] = arr[0];

        for (int i = 1; i < n; i++) {
            if (arr[i] != temp[k - 1]) {  
                temp[k++] = arr[i];
            }
        }

        return Arrays.copyOf(temp, k);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter array length:");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter sorted elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        arr = removeDuplicates(arr);

        System.out.println("After removing duplicates:");
        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}
