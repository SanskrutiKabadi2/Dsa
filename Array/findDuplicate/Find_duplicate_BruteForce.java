// Brute force method (O(n^2))

import java.util.Scanner;

public class Main {  
    static void findDuplicateBruteForce(int arr[]) {

        System.out.println("Duplicate Elements:");

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println(arr[i]);
                    break; // to avoid printing same duplicate multiple times
                }
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking array length
        System.out.print("Enter array length: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        // Taking array elements
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Call brute force function
        findDuplicateBruteForce(arr);
    }
}
