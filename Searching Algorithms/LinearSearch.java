import java.util.*;
class LinearSearch{
	int linearSear(int arr[],int ele){
		for(int i=0;i<arr.length;i++){
			if(arr[i]==ele)
                        	return i;


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
		LinearSearch obj=new LinearSearch();
		int ans=obj.linearSear(arr,ele);
		if(ans==-1){
			 System.out.println("Element not found in array");
		}
		else{
			 System.out.println("Element found at index : "+ans);
		}
	
	
	}

}

// Time Complexity : O(n)
// Space Complexity : O(1)
