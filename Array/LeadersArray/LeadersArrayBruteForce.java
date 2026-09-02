import java.util.*;

class Main {
    static List<Integer> leadersArray(int[] arr) {
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            boolean leader = true;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] <= arr[j]) {
                    leader = false;
                    break;
                }
            }

            if (leader) {
                result.add(arr[i]);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size :");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Leaders Array : " + leadersArray(arr));
    }
}
