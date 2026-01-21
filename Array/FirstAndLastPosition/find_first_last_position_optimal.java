import java.util.*;

class FirstLast {

    static int find(int[] arr, int start, int end, int x, boolean first) {
        int ans = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == x) {
                ans = mid;
                if (first)
                    end = mid - 1;
                else
                    start = mid + 1;
            } 
            else if (arr[mid] < x) {
                start = mid + 1;
            } 
            else {
                end = mid - 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int x = sc.nextInt();

        int first = find(arr, 0, n - 1, x, true);
        int last = find(arr, 0, n - 1, x, false);

        System.out.print(first + " " + last);
    }
}
