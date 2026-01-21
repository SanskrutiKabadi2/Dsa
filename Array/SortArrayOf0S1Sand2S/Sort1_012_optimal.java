import java.util.*;

class Sort1 {

    static void Sort(int a[], int n) {
        int low = 0, mid = 0, high = n - 1;
        int temp;

        while (mid <= high) {
            if (a[mid] == 0) {
                temp = a[low];
                a[low] = a[mid];
                a[mid] = temp;
                low++;
                mid++;
            }
            else if (a[mid] == 1) {
                mid++;
            }
            else { // a[mid] == 2
                temp = a[mid];
                a[mid] = a[high];
                a[high] = temp;
                high--;
            }
        }
    }

    static void Print(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.print("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Sort(arr, n);
        Print(arr, n);
    }
}
