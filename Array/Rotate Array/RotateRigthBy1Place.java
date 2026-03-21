import java.util.Scanner;
public class RotateRight {
  static void rotateRightByOne(int arr[], int n) {
        int last = arr[n - 1]; 
        for (int i = n - 1; i > 0; i--) {
            arr[i] = arr[i - 1]; 
        }

        arr[0] = last; 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        rotateRightByOne(arr, n);

        System.out.println("Array after right rotation:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
