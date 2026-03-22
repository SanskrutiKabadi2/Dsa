import java.util.Scanner;

public class RotationCount {

    static int findRotationCount(int arr[]) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            if (arr[low] <= arr[high]) {
                return low;
            }

            int mid = low + (high - low) / 2;

            int next = (mid + 1) % arr.length;
            int prev = (mid - 1 + arr.length) % arr.length;

            if (arr[mid] <= arr[next] && arr[mid] <= arr[prev]) {
                return mid;
            }

            if (arr[low] <= arr[mid]) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter elements:");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int rotations = findRotationCount(arr);

        System.out.println("Rotation count = " + rotations);
    }
}
