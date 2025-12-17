// Two Sum Better

import java.util.*;

class TwoSumBetter {

    static int[] twoSum(int[] arr, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int rem = target - arr[i];

            if (map.containsKey(rem)) {
                return new int[]{map.get(rem), i};
            }
            map.put(arr[i], i);
        }
        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter array length:");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        System.out.println("Enter target:");
        int target = sc.nextInt();

        int[] ans = twoSum(arr, target);
        System.out.println(ans[0] + " " + ans[1]);
    }
}
