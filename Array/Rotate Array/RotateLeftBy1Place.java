import java.util.Scanner;

public class RotateLeft {

    static void rotateLeftByOne(int arr[], int n) {
        int first = arr[0];  

        for (int i = 0; i < n - 1; i++) {
            arr[i] = arr[i + 1]; 
        }

        arr[n - 1] = first; 
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

        rotateLeftByOne(arr, n);

        System.out.println("Array after left rotation:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
