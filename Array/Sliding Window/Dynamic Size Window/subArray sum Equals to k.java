class Solution {
    static int[] subarraySum(int[] arr, int target) {
        int n = arr.length;
        int left = 0, right = 0;
        int sum = 0;

        while (right < n) {
            sum += arr[right];

            while (sum > target && left <= right) {
                sum -= arr[left];
                left++;
            }

            if (sum == target) {
                return new int[]{left + 1, right + 1}; // 1-based indexing
            }

            right++;
        }

        return new int[]{-1};
    }
}
