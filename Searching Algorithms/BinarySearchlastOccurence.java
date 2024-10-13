import java.util.*;
class BinarySearLastOccur{
        int binarySear(int arr[],int ele){
		int start=0;
		int end=arr.length-1;
		
                while(start<=end){
			 int mid=(start+end)/2;
                        if(arr[mid]==ele)
                                return mid;
			if(ele<arr[mid])
				end=mid-1;

			if(ele>arr[mid])
                                start=mid+1;

                }
                return -1;
        }
        public static void main(String []args){
                Scanner sc=new Scanner(System.in);
                System.out.println("Enter the size of array : ");
                int size=sc.nextInt();
                int arr[]=new int[size];
                System.out.println("Enter the elements of array : ");
                for(int i=0;i<arr.length;i++){
                        arr[i]=sc.nextInt();

                }
                System.out.println("Enter the element to be search in array : ");
                int ele=sc.nextInt();
                BinarySearLastOccur obj=new  BinarySearLastOccur();
                int ans=obj.binarySear(arr,ele);
                if(ans==-1){
                         System.out.println("Element not found in array");
                }
                else{
                         System.out.println("Last Occurence of Element found at index : "+ans);
                }


        }
}
// Time Complexity : O(logn)
// Space Complexity : O(1)
