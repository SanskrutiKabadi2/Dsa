import java.util.*;
class RightMax{
        static int[] carryforward(int arr[], int n){

                int rightMax[]=new int[n];
                int maxEle=Integer.MIN_VALUE;
                for(int i=n-1;i>=0;i--){
                        if(arr[i]>maxEle){
                                maxEle=arr[i];
                        }
                        rightMax[i]=maxEle;
                 
                }
                return rightMax;

        }

                public static void main(String[] args){
                Scanner Sc=new Scanner(System.in);
                System.out.println("Enter size of array : ");
                int size=Sc.nextInt();
                int arr[]=new int[size];
                System.out.println("Enter elements of array : ");
                for(int i=0;i<arr.length;i++){
                        arr[i]=Sc.nextInt();

                }
               int arr1[]=carryforward(arr,size);
               System.out.print("rightMax array : ");
               for(int i=0;i<arr1.length;i++){
                        System.out.print(arr1[i]+ " ");

                }
               System.out.println();
        }

}
                    
// Time Complexity : O(N)
// Space Complexity : O(n)
