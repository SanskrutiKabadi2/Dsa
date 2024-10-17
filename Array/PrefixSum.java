import java.util.*;
class PrefixSum{
        static void PrefixSum(int arr[]){
               int prefixSumArr[]=new int[arr.length];
	       prefixSumArr[0]=arr[0];
                for(int i=1;i<arr.length;i++){
                        prefixSumArr[i]=prefixSumArr[i-1]+arr[i];
                }
		for(int i=0;i<arr.length;i++){
			 System.out.print(prefixSumArr[i]+" ");
		}
                

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
               
                 PrefixSum(arr);
        }


}

// Time Complexity O(N)
// Space complexity O(N)
