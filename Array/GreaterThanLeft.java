import java.util.*;
class Array2{
        static int GreaterThanLeft(int arr[]){
                int count=0;
                for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[j]>arr[i]){
                        		count++;
					break;
				}
			}
                }
		return count;

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
                System.out.println("Element count = "+greatEleCount(arr));
        }


}

// Time Complexity : O(N^2)
// Space Complexity : O(1)
