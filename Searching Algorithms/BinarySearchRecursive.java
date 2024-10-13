import java.util.*;
class BinarySearchRecursive{
        int binarySear(int arr[],int start,int end,int ele){
                
			int mid=(start+end)/2;
			if(start>end)
				return -1;
			else{
                        	if(arr[mid]==ele){
                                	return mid;
				}
				if(ele<arr[mid]){
					return binarySear(arr,start,mid-1,ele);
				}
				else{
                                	return binarySear(arr,mid+1,end,ele);
				}
			}

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
		int start=0;
		int end=arr.length-1;
                BinarySearchRecursive obj=new BinarySearchRecursive();
                int ans=obj.binarySear(arr,start,end,ele);
                if(ans==-1){
                         System.out.println("Element not found in array");
                }
                else{
                         System.out.println("Element found at index : "+ans);
                }


        }
}
// Time Complexity : O(logn)
// Space Complexity : O(1)
