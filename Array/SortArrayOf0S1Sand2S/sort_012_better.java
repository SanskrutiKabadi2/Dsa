import java.util.*;

class Sort1 {

    static void Sort(int a[], int n) {
        int c0 = 0, c1 = 0, c2 = 0;

        for (int i = 0; i < n; i++) {
            if (a[i] == 0) c0++;
            else if (a[i] == 1) c1++;
            else c2++;
        }

        int idx = 0;

        for (int i = 0; i < c0; i++) {
            a[idx] = 0;
            idx++;
        }

        for (int i = 0; i < c1; i++) {
            a[idx] = 1;
            idx++;
        }

        for (int i = 0; i < c2; i++) {
            a[idx] = 2;
            idx++;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Sort(arr, n);

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
