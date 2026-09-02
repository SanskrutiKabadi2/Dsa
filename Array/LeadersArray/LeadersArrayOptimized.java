import java.util.*;

class Main {
    static List<Integer> leadersArray(int[] arr){
        int max=Integer.MIN_VALUE;
        List<Integer> result=new ArrayList<>();
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]>max){
                result.addFirst(arr[i]);
                max=arr[i];
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
        System.out.print("Leaders Array : "+leadersArray(arr));   
    }
}
