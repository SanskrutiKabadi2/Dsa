// Two Sum Optimal
import java.util.*;

class TwoSumOptimal {

    static int[] twoSum(int[] arr, int target) {
        int left = 0, right = arr.length - 1;

        while (left < right) {
            int sum = arr[left] + arr[right];

            if (sum == target) {
                return new int[]{left, right};
            } 
            else if (sum < target) {
                left++;
            } 
            else {
                right--;
            }
        }
        return new int[]{-1, -1}; // not found
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

        System.out.println("Enter target:");
        int target = sc.nextInt();

        int[] result = twoSum(arr, target);

        System.out.println("Indices:");
        System.out.println(result[0] + " " + result[1]);
    }
}
