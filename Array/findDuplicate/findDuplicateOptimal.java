import java.util.HashMap;
import java.util.Scanner;

public class Main {

    // optimal method to find duplicates
    static void findDuplicateOptimal(int arr[]) {
        HashMap<Integer, Integer> hs = new HashMap<>();

        System.out.println("Duplicate Elements:");
        for (int num : arr) {
            if (hs.containsKey(num)) {
                System.out.println(num);
            } else {
                hs.put(num, 1);
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Ask array length
        System.out.print("Enter array length: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        // Take dynamic input
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Call optimal method
        findDuplicateOptimal(arr);
    }
}
